# Design-pattern-java
# 디자인패턴

### 효율적인 프로그래밍을 하고 있다고 판단하는 기준

- 중복된 코드가 없다.
- 변경된 요구사항을 순조롭게 받아들일 수 있어야한다.

### 디자인패턴을 적용하여 프로그램을 만드는 중요한 이유

- 다양한 추가 요구사항에 대해 좀 더 쉽게 대응하기 위해서이다. 즉! 쉽게 코드를 수정할 수 있게 하기 위해서이다.

### 디자인패턴도 같은 상황에 하나의 패턴만이 정답은 아니다.

- 가성비를 따질 수도 있고 여러 가지 상황에 따라 적절한 패턴을 적용하게 된다.



## DI

-------------

[![2021-08-17-11-45-58.png](https://i.postimg.cc/fLZvz8f0/2021-08-17-11-45-58.png)](https://postimg.cc/wtfNFcP6)

## 싱글턴 패턴

------------------

- 객체가 너무 많아지면 컴퓨터 자원을 과도하게 사용하게 되고, 이는 프로그램 전체의 속도를 느리게 할 수 있다. ➔ 개발자는 객체의 최대 개수를 제한 할 필요가 생긴다.
- 즉, 싱글턴 패턴은 **최대 N개로 객체 생성을 제한하는 패턴이다.** ➔ 여기서 중요한 것은 생성되는 객체의 최대 개수를 제한하는 데 있어 객체의 생성을 요청하는 쪽에서는 일일이 신경쓰지 않아도 되도록 만들어주는 것이다.

#### 사용 예

- 일반 자바 프로그래밍
  - 데이터베이스 커넥션 풀
  - 로그 라이터
- 게임 프로그래밍 
  - 사운드 매니저
  - 스코어 매니저

##### 바로가기
[싱글톤 문제점 파악하기](https://github.com/JangHyeonJun2/Design-pattern-java/tree/master/src/main/java/case1)<br>
[싱글톤 예제 보러가기](https://github.com/JangHyeonJun2/Design-pattern-java/tree/master/src/main/java/case2)

-----------------------
## 플라이웨이트 패턴

--------------

#### 플라이웨이트 패턴은 비용이 큰 자원을 공통으로 사용할 수 있도록 만드는 패턴이다. 자원에 대한 비용은 크게 두가지로 나눠 볼 수 있다.

1. 중복 생성될 가능성이 높은 경우.
   - 중복 생성될 가능성이 높다는 것은 동일한 자원이 자주 사용될 가능성이 매우 높다는 것을 의미한다. 이런 자원은 공통 자원 형태로 관리해 주는 편이 좋다.
2. 자원 생성 비용은 큰데 사용 빈도가 낮은 경우.
   - 이런 자원을 항상 미리 생성해 두는 것은 낭비이다. 따라서 요청이 있을 때에 생성해서 제공해주는 편이 좋다. 

##### 이 두가지 목적을 위해서 플라이웨이트 패턴은 자원 생성과 제공을 책임진다. 자원의 생성을 담당하는 Factory 역할과 관리 역할을 분리하는 것이 좋을 수 있으나, 일반적으로는 두 역할의 크기가 크지 않아서 하나의 클래스가 담당하도록 구현함.

### 예를 들어보자

---------

- 클래스로 나타내면 다음과 같다. Tree 클래스를 생성한다고 가정해보자 Tree 클래스로 만들어지는 객체는 mesh(뿌리), bark(껍질), leaves(나뭇잎) 객체를 직접 만들지 않고 미리 만들어진 TreeModel을 사용하게 한다.

  ```java
  //공유할 객체를 감쌀 나무 모델 클래스를 정의
  public class TreeModel {
    Mesh mesh;
    Texture bark;
    Texture leaves;
    
    public TreeModel() {
      mesh = new Mesh();
      bark = new Texture("bark");
      leaves = new leaves("leaves");
    }
  }
  ```

  ```java
  //실제로 매번 생성할 나무 클래스를 정의한다.
  pulic class Tree {
    TreeModel treeModel; //공유할 객체
    Position position;
    double height;
    double thickness;
  }
  ```

  - 또한 밑에 코드처럼  static 변수로 선언된 객체를 하나 만들어 모든 Tree 객체의 내부에서 사용되는 TreeModel에서 공유한다.

  ```java
  //팩토리 메서드를 정의한다.
  public class TreeFactory {
    private static final TreeModel sharedTreeModel = new TreeModel();
    static public Tree create(Position position, double height, double thickness) {
      Tree tree = new Tree();
      tree.setPostion(position);
      tree.setHeight(height);
      tree.setThickness(thickness);
      tree.setTreeModel(sharedTreeModel);
    }
  }
  ```

  

### 장단점

- 장점
  - 많은 객체를 만들 때 성능을 향상시킬 수 있다.
  - 많은 객체를 만들 때 메모리를 줄일 수 있다.
  - state pattern과 쉽게 결합될 수 있다.
- 단점
  - 특정 인스턴스의 공유 컴포넌트를 다르게 행동하게 하는 것이 불가능하다.( 개별 설정이 불가능함... )

##### 바로가기
[플라이웨이트 예제 바로가기](https://github.com/JangHyeonJun2/Design-pattern-java/tree/master/src/main/java/case3/step3)

-----------------

 ## 빌더 패턴

------------

## 옵저버 패턴

- 한 객체의 상태가 바뀌면 그 객체에 의존하는 다른 객체들한테 연락이 가고 자동으로 내용이 갱신되는 방식으로 일대다(one-to-many) 의존성을 정의한다.

  [<img src="https://i.postimg.cc/3JG6yFtB/2021-08-22-7-01-41.png" alt="2021-08-22-7-01-41.png" style="zoom:50%;" />

  

[![2021-08-22-7-03-43.png](https://i.postimg.cc/5tDLFL7B/2021-08-22-7-03-43.png)](https://postimg.cc/yJXkMgzx)



### 자바 내장 옵저버 패턴 사용

##### java.util.Observer 인터페이스와 java.util.Observable 클래스를 사용할 수 있다.

- 자바 내장 옵저버 패턴은 푸시 방식, 풀 방식 모두 사용 가능

- **java.util.Observer 인터페이스를 구현하고 java.util.Observable 객체의 addObserver() 메소드를 호출하면 옵저버 목록에 추가가 되고 deleteObserver()를 호출하면 옵저버 목록에서 제거가 된다.**
  **연락을 돌리는 방법은 java.util.Observable를 상속받는 주제 클래스에서 setChanged() 메소드를 호출해서 객체의 상태가 바뀌었다는 것을 알린 후 notifyObservers() 또는 notifyObserver(Object arg) 메소드를 호출하면 된다. (인자값을 넣어주는 메소드는 푸시방식으로 쓰임)**
  **옵저버 객체가 연락을 받는 방법은 update(Observable o, Object arg) 메소드를 구현하기만 하면 된다. Observable o 에는 연락을 보내는 주제 객체가 인자로 전달이 되고 Object arg에는 notifyObservers(Object arg) 메소드에서 인자로 전달된 데이터 객체가 넘어온다.**
- 참고!!!! java.util.Observer, java.util.Observable 은 Deprecate 되었다.

### 장점

1. 실시간으로 한 객체의 변경사항을 다른 객체에 전파할 수 있다.
2. 느슨한 결합으로 시스템이 유연하고 객체간의 의존성을 제거할 수 있다.

### 단점

1. 너무 많이 사용하게 되면, 상태 관리가 힘들 수 있습니다.
2. 데이터 배분에 문제가 생기면 자칫 큰 문제로 이어질 수 있다.
