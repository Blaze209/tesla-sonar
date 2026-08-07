package ch.qos.logback.core.helpers;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class CyclicBuffer<E> {

    /* JADX INFO: renamed from: ea, reason: collision with root package name */
    E[] f19338ea;
    int first;
    int last;
    int maxSize;
    int numElems;

    public CyclicBuffer(int i11) {
        if (i11 >= 1) {
            init(i11);
            return;
        }
        throw new IllegalArgumentException("The maxSize argument (" + i11 + ") is not a positive integer.");
    }

    private void init(int i11) {
        this.maxSize = i11;
        this.f19338ea = (E[]) new Object[i11];
        this.first = 0;
        this.last = 0;
        this.numElems = 0;
    }

    public void add(E e11) {
        E[] eArr = this.f19338ea;
        int i11 = this.last;
        eArr[i11] = e11;
        int i12 = i11 + 1;
        this.last = i12;
        int i13 = this.maxSize;
        if (i12 == i13) {
            this.last = 0;
        }
        int i14 = this.numElems;
        if (i14 < i13) {
            this.numElems = i14 + 1;
            return;
        }
        int i15 = this.first + 1;
        this.first = i15;
        if (i15 == i13) {
            this.first = 0;
        }
    }

    public List<E> asList() {
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < length(); i11++) {
            arrayList.add(get(i11));
        }
        return arrayList;
    }

    public void clear() {
        init(this.maxSize);
    }

    public E get() {
        int i11 = this.numElems;
        if (i11 <= 0) {
            return null;
        }
        this.numElems = i11 - 1;
        E[] eArr = this.f19338ea;
        int i12 = this.first;
        E e11 = eArr[i12];
        eArr[i12] = null;
        int i13 = i12 + 1;
        this.first = i13;
        if (i13 == this.maxSize) {
            this.first = 0;
        }
        return e11;
    }

    public int getMaxSize() {
        return this.maxSize;
    }

    public int length() {
        return this.numElems;
    }

    public void resize(int i11) {
        if (i11 < 0) {
            throw new IllegalArgumentException("Negative array size [" + i11 + "] not allowed.");
        }
        int i12 = this.numElems;
        if (i11 == i12) {
            return;
        }
        E[] eArr = (E[]) new Object[i11];
        if (i11 < i12) {
            i12 = i11;
        }
        for (int i13 = 0; i13 < i12; i13++) {
            E[] eArr2 = this.f19338ea;
            int i14 = this.first;
            eArr[i13] = eArr2[i14];
            eArr2[i14] = null;
            int i15 = i14 + 1;
            this.first = i15;
            if (i15 == this.numElems) {
                this.first = 0;
            }
        }
        this.f19338ea = eArr;
        this.first = 0;
        this.numElems = i12;
        this.maxSize = i11;
        if (i12 == i11) {
            this.last = 0;
        } else {
            this.last = i12;
        }
    }

    public CyclicBuffer(CyclicBuffer<E> cyclicBuffer) {
        int i11 = cyclicBuffer.maxSize;
        this.maxSize = i11;
        E[] eArr = (E[]) new Object[i11];
        this.f19338ea = eArr;
        System.arraycopy(cyclicBuffer.f19338ea, 0, eArr, 0, i11);
        this.last = cyclicBuffer.last;
        this.first = cyclicBuffer.first;
        this.numElems = cyclicBuffer.numElems;
    }

    public E get(int i11) {
        if (i11 < 0 || i11 >= this.numElems) {
            return null;
        }
        return this.f19338ea[(this.first + i11) % this.maxSize];
    }
}
