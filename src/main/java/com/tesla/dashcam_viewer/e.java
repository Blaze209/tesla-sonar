package com.tesla.dashcam_viewer;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.List;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0000¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000eR\u001e\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0010R\u0016\u0010\u0013\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u000eR\u0016\u0010\u0015\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u000eR\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcom/tesla/dashcam_viewer/e;", "T", "", "", "size", "<init>", "(I)V", "element", "Ljn0/h0;", "b", "(Ljava/lang/Object;)V", "", "a", "()Ljava/util/List;", "I", "", "[Ljava/lang/Object;", "buffer", "c", "readIndex", DateTokenConverter.CONVERTER_KEY, "writeIndex", "", "e", "Z", "isFull", "dashcam-viewer_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class e<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int size;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private T[] buffer;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int readIndex;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int writeIndex;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private boolean isFull;

    public e(int i11) {
        this.size = i11;
        this.buffer = (T[]) new Object[i11];
    }

    public final List<T> a() {
        return this.isFull ? p013kotlin.collections.v.P0(p013kotlin.collections.n.h0(p013kotlin.collections.n.w(this.buffer, this.readIndex, this.size)), p013kotlin.collections.n.h0(p013kotlin.collections.n.w(this.buffer, 0, this.readIndex))) : p013kotlin.collections.n.h0(p013kotlin.collections.n.w(this.buffer, 0, this.writeIndex));
    }

    public final void b(T element) {
        T[] tArr = this.buffer;
        int i11 = this.writeIndex;
        tArr[i11] = element;
        int i12 = this.size;
        int i13 = (i11 + 1) % i12;
        this.writeIndex = i13;
        if (this.isFull) {
            this.readIndex = (this.readIndex + 1) % i12;
        } else if (i13 == this.readIndex) {
            this.isFull = true;
        }
    }
}
