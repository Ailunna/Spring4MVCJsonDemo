package com.yqqq.study.weakhashmap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.Date;
import java.lang.ref.WeakReference;

/**
 * @desc HashMap �� WeakHashMap�Ƚϳ���
 *
 * @author skywang
 * @email kuiwu-wang@163.com
 */
public class CompareHashmapAndWeakhashmap {

    public static void main(String[] args) throws Exception {

        // ������������Stringʱ���Ƚ�HashMap��WeakHashMap
        compareWithString();
        // �������������Զ�������ʱ���Ƚ�HashMap��WeakHashMap
        compareWithSelfClass();
    }

    /**
     * ����map������ӡmap�Ĵ�С
     */
    private static void iteratorAndCountMap(Map map) {
        // ����map
        for (Iterator iter = map.entrySet().iterator();
                iter.hasNext();  ) {
            Map.Entry en = (Map.Entry)iter.next();
            System.out.printf("map entry : %s - %s\n ",en.getKey(), en.getValue());
        }

        // ��ӡHashMap��ʵ�ʴ�С
        System.out.printf(" map size:%s\n\n", map.size());
    }

    /**
     * ͨ��String�������HashMap��WeakHashMap
     */
    private static void compareWithString() {
        // �½�4��String�ַ���
        String w1 = new String("W1");
        String w2 = new String("W2");
        String h1 = new String("H1");
        String h2 = new String("H2");

        // �½� WeakHashMap���󣬲���w1,w2��ӵ� WeakHashMap��
        Map wmap = new WeakHashMap();
        wmap.put(w1, "w1");
        wmap.put(w2, "w2");

        // �½� HashMap���󣬲���h1,h2��ӵ� WeakHashMap��
        Map hmap = new HashMap();
        hmap.put(h1, "h1");
        hmap.put(h2, "h2");

        // ɾ��HashMap�еġ�h1����
        // �����ɾ����h1��֮��HashMap��ֻ�� h2 ��
        hmap.remove(h1);

        // ��WeakHashMap�е�w1����null����ִ��gc()��ϵͳ�����w1
        // �����w1�ǡ�����������GC���պ�WeakHashMap��w1��Ӧ�ļ�ֵ�ԣ�Ҳ�ᱻ��WeakHashMap��ɾ����
        //       w2�ǡ�����������������null�����ᱻGC���գ�Ҳ�Ͳ��ᱻ��WeakHashMap��ɾ����
        // ��ˣ�WeakHashMap��ֻ�� w2
        // ע�⣺��ȥ����w1=null�� ���ߡ�System.gc()����������᲻һ����
        w1 = null;
        System.gc();

        // ��������ӡHashMap�Ĵ�С
        System.out.printf(" -- HashMap --\n");
        iteratorAndCountMap(hmap);

        // ��������ӡWeakHashMap�Ĵ�С
        System.out.printf(" -- WeakHashMap --\n");
        iteratorAndCountMap(wmap);
    }

    /**
     * ͨ���Զ��������HashMap��WeakHashMap
     */
    private static void compareWithSelfClass() {
        // �½�4���Զ������
        Self s1 = new Self(10);
        Self s2 = new Self(20);
        Self s3 = new Self(30);
        Self s4 = new Self(40);
        
        // �½� WeakHashMap���󣬲���s1,s2��ӵ� WeakHashMap��
        Map wmap = new WeakHashMap();
        wmap.put(s1, "s1");
        wmap.put(s2, "s2");
        
        // �½� HashMap���󣬲���s3,s4��ӵ� WeakHashMap��
        Map hmap = new HashMap();
        hmap.put(s3, "s3");
        hmap.put(s4, "s4");

        // ɾ��HashMap�е�s3��
        // �����ɾ��s3֮��HashMap��ֻ�� s4 ��
        hmap.remove(s3);

        // ��WeakHashMap�е�s1����null����ִ��gc()��ϵͳ�����w1
        // �����s1�ǡ�����������GC���պ�WeakHashMap��s1��Ӧ�ļ�ֵ�ԣ�Ҳ�ᱻ��WeakHashMap��ɾ����
        //       w2�ǡ�����������������null�����ᱻGC���գ�Ҳ�Ͳ��ᱻ��WeakHashMap��ɾ����
        // ��ˣ�WeakHashMap��ֻ�� s2
        // ע�⣺��ȥ����s1=null�� ���ߡ�System.gc()����������᲻һ����
        s1 = null;
        System.gc();

        /*
        // ����500ms
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // */
        
        // ��������ӡHashMap�Ĵ�С
        System.out.printf(" -- Self-def HashMap --\n");
        iteratorAndCountMap(hmap);

        // ��������ӡWeakHashMap�Ĵ�С
        System.out.printf(" -- Self-def WeakHashMap --\n");
        iteratorAndCountMap(wmap);
    }

    private static class Self { 
        int id;

        public Self(int id) {
            this.id = id;
        }

        // ����finalize()����
        // ��GC����ʱ�ᱻִ��
        protected void finalize() throws Throwable {
            super.finalize();
            System.out.printf("GC Self: id=%d addr=0x%s)\n", id, this);
        }   
    }
}