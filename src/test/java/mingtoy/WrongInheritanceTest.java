package mingtoy;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

public class WrongInheritanceTest {

    public class InstrumentHashSet<E> extends HashSet<E> {

        private Long collectionCount = 0L;

        @Override
        public boolean add(E e) {

            collectionCount++;
            return super.add(e);
        }

        @Override
        public boolean addAll(Collection<? extends E> e) {

            collectionCount = collectionCount + e.size();
            return super.addAll(e);
        }
    }

    @Test
    public void overrideExample() {

        InstrumentHashSet<String> testSet = new InstrumentHashSet<String>();

        testSet.addAll(Arrays.asList("abc", "dbf", "efg"));

        // 예상 결과는 3이지만, HashSet의 addAll메소드 내부에서 호출하는 add 메소드는 override 된 InstrumentHashSet의 add를 호출해,
        // collectionCount를 의도치 않게 증가시키고 있다
        //assert (testSet.collectionCount == 3);
        assert (testSet.collectionCount == 6);
    }

    public class Parent {

        public void onlyParentS() {
            //2
            System.out.println("return alphabet : " + alPhabet());
            //4
        }

        public void call() {

            System.out.println("parent method call");
        }

        public String alPhabet() {

            return "P";
        }
    }


    public class Son extends Parent {

        public void call() {

            System.out.println("son method call");
        }

        public String alPhabet() {
            //3
            return "S";
        }
    }

    @Test
    public void downCastingExample() {

        Parent parent = new Son();
        Son son = (Son) parent;
        son.call();

        Son selfReference = new Son();
        son.onlyParentS(); // 1
    }
}
