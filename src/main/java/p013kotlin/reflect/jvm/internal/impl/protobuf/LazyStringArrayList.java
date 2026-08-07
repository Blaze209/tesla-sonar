package p013kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes9.dex */
public class LazyStringArrayList extends AbstractList<String> implements RandomAccess, LazyStringList {
    public static final LazyStringList EMPTY = new LazyStringArrayList().getUnmodifiableView();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<Object> f88306a;

    public LazyStringArrayList() {
        this.f88306a = new ArrayList();
    }

    private static ByteString a(Object obj) {
        if (obj instanceof ByteString) {
            return (ByteString) obj;
        }
        return obj instanceof String ? ByteString.copyFromUtf8((String) obj) : ByteString.copyFrom((byte[]) obj);
    }

    private static String b(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        return obj instanceof ByteString ? ((ByteString) obj).toStringUtf8() : Internal.toStringUtf8((byte[]) obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        this.f88306a.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.LazyStringList
    public ByteString getByteString(int i11) {
        Object obj = this.f88306a.get(i11);
        ByteString byteStringA = a(obj);
        if (byteStringA != obj) {
            this.f88306a.set(i11, byteStringA);
        }
        return byteStringA;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.LazyStringList
    public List<?> getUnderlyingElements() {
        return Collections.unmodifiableList(this.f88306a);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.LazyStringList
    public LazyStringList getUnmodifiableView() {
        return new UnmodifiableLazyStringList(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f88306a.size();
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i11, String str) {
        this.f88306a.add(i11, str);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i11, Collection<? extends String> collection) {
        if (collection instanceof LazyStringList) {
            collection = ((LazyStringList) collection).getUnderlyingElements();
        }
        boolean zAddAll = this.f88306a.addAll(i11, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // java.util.AbstractList, java.util.List
    public String get(int i11) {
        Object obj = this.f88306a.get(i11);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.f88306a.set(i11, stringUtf8);
            }
            return stringUtf8;
        }
        byte[] bArr = (byte[]) obj;
        String stringUtf9 = Internal.toStringUtf8(bArr);
        if (Internal.isValidUtf8(bArr)) {
            this.f88306a.set(i11, stringUtf9);
        }
        return stringUtf9;
    }

    @Override // java.util.AbstractList, java.util.List
    public String remove(int i11) {
        Object objRemove = this.f88306a.remove(i11);
        ((AbstractList) this).modCount++;
        return b(objRemove);
    }

    @Override // java.util.AbstractList, java.util.List
    public String set(int i11, String str) {
        return b(this.f88306a.set(i11, str));
    }

    public LazyStringArrayList(LazyStringList lazyStringList) {
        this.f88306a = new ArrayList(lazyStringList.size());
        addAll(lazyStringList);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.LazyStringList
    public void add(ByteString byteString) {
        this.f88306a.add(byteString);
        ((AbstractList) this).modCount++;
    }
}
