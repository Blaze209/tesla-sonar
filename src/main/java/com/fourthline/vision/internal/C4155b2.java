package com.fourthline.vision.internal;

import com.fourthline.core.internal.TimestampProvider;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.vision.internal.b2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4155b2 extends O5 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f38168f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final InterfaceC4306w0 f38169g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f38170h;

    public /* synthetic */ C4155b2(int i11, InterfaceC4306w0 interfaceC4306w0, TimestampProvider timestampProvider, long j11, TimeUnit timeUnit, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, interfaceC4306w0, timestampProvider, j11, (i12 & 16) != 0 ? TimeUnit.MILLISECONDS : timeUnit);
    }

    private final Long getTimestampOfFirstImageTaken() {
        Object obj;
        Iterable iterable = (Iterable) this.f38169g.get();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : iterable) {
            if (obj2 instanceof C4288t3) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList(p013kotlin.collections.v.y(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(Long.valueOf(((C4288t3) it.next()).getTimestamp()));
        }
        Iterator it2 = arrayList2.iterator();
        if (it2.hasNext()) {
            Object next = it2.next();
            if (it2.hasNext()) {
                long jLongValue = ((Number) next).longValue();
                do {
                    Object next2 = it2.next();
                    long jLongValue2 = ((Number) next2).longValue();
                    if (jLongValue > jLongValue2) {
                        next = next2;
                        jLongValue = jLongValue2;
                    }
                } while (it2.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        return (Long) obj;
    }

    @Override // com.fourthline.vision.internal.AbstractC4222k, com.fourthline.vision.internal.G5, com.fourthline.vision.internal.InterfaceC4265q0
    public /* bridge */ /* synthetic */ Object consume(Object obj, Continuation continuation) {
        return consume((jn0.h0) obj, (Continuation<? super jn0.h0>) continuation);
    }

    @Override // com.fourthline.vision.internal.AbstractC4222k, com.fourthline.vision.internal.G5, com.fourthline.vision.internal.F5
    public void stop() {
        this.f38170h = false;
        super.stop();
    }

    @Override // com.fourthline.vision.internal.AbstractC4222k
    public Object consume(jn0.h0 h0Var, Continuation<? super jn0.h0> continuation) {
        Long timestampOfFirstImageTaken;
        if (this.f38168f > 1 && this.f38170h && (timestampOfFirstImageTaken = getTimestampOfFirstImageTaken()) != null) {
            setStartTimestamp(timestampOfFirstImageTaken.longValue());
        }
        Object objConsume = super.consume(h0Var, continuation);
        return objConsume == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objConsume : jn0.h0.f84049a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4155b2(int i11, InterfaceC4306w0 metadataSource, TimestampProvider timestampProvider, long j11, TimeUnit timeUnit) {
        super(timestampProvider, j11, timeUnit);
        p013kotlin.jvm.internal.s.k(metadataSource, "metadataSource");
        p013kotlin.jvm.internal.s.k(timestampProvider, "timestampProvider");
        p013kotlin.jvm.internal.s.k(timeUnit, "timeUnit");
        this.f38168f = i11;
        this.f38169g = metadataSource;
        this.f38170h = true;
    }
}
