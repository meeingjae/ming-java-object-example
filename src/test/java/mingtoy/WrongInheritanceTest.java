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
}
