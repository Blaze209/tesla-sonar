package com.facebook.react.uimanager.events;

import android.util.SparseIntArray;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\n\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\bJ\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\bJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/facebook/react/uimanager/events/r;", "", "<init>", "()V", "", "downTime", "Ljn0/h0;", "a", "(J)V", DateTokenConverter.CONVERTER_KEY, "", "b", "(J)S", "e", "", "c", "(J)Z", "Landroid/util/SparseIntArray;", "Landroid/util/SparseIntArray;", "downTimeToCoalescingKey", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final SparseIntArray downTimeToCoalescingKey = new SparseIntArray();

    public final void a(long downTime) {
        this.downTimeToCoalescingKey.put((int) downTime, 0);
    }

    public final short b(long downTime) {
        int i11 = this.downTimeToCoalescingKey.get((int) downTime, -1);
        if (i11 != -1) {
            return (short) (i11 & 65535);
        }
        throw new RuntimeException("Tried to get non-existent cookie");
    }

    public final boolean c(long downTime) {
        return this.downTimeToCoalescingKey.get((int) downTime, -1) != -1;
    }

    public final void d(long downTime) {
        int i11 = (int) downTime;
        int i12 = this.downTimeToCoalescingKey.get(i11, -1);
        if (i12 == -1) {
            throw new RuntimeException("Tried to increment non-existent cookie");
        }
        this.downTimeToCoalescingKey.put(i11, i12 + 1);
    }

    public final void e(long downTime) {
        this.downTimeToCoalescingKey.delete((int) downTime);
    }
}
