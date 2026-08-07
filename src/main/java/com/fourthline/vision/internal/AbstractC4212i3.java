package com.fourthline.vision.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import p013kotlin.Pair;
import p013kotlin.coroutines.Continuation;

/* JADX INFO: renamed from: com.fourthline.vision.internal.i3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC4212i3 implements InterfaceC4306w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4306w0 f38400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final wn0.a f38401b;

    public AbstractC4212i3(InterfaceC4306w0 metadataSource, wn0.a<Long> maxDuration) {
        p013kotlin.jvm.internal.s.k(metadataSource, "metadataSource");
        p013kotlin.jvm.internal.s.k(maxDuration, "maxDuration");
        this.f38400a = metadataSource;
        this.f38401b = maxDuration;
    }

    private final List<AbstractC4316x3> getMetadataEvents() {
        return (List) this.f38400a.get();
    }

    private final long getRecordingEndTimestamp() throws AbstractC4277s.e {
        AbstractC4316x3 abstractC4316x3Previous;
        List<AbstractC4316x3> metadataEvents = getMetadataEvents();
        ListIterator<AbstractC4316x3> listIterator = metadataEvents.listIterator(metadataEvents.size());
        do {
            if (!listIterator.hasPrevious()) {
                abstractC4316x3Previous = null;
                break;
            }
            abstractC4316x3Previous = listIterator.previous();
        } while (!(abstractC4316x3Previous instanceof C4309w3));
        AbstractC4316x3 abstractC4316x3 = abstractC4316x3Previous;
        if (abstractC4316x3 != null) {
            return abstractC4316x3.getTimestamp();
        }
        throw AbstractC4277s.e.f38823a;
    }

    protected final long getFirstImageTakenTimestamp(List<? extends AbstractC4316x3> list) throws AbstractC4277s.e {
        Object obj;
        p013kotlin.jvm.internal.s.k(list, "<this>");
        if (getClass().isAnonymousClass()) {
            String name = getClass().getName();
            int length = name.length();
            p013kotlin.jvm.internal.s.h(name);
            if (length > 23) {
                p013kotlin.jvm.internal.s.j(name.substring(name.length() - 23, name.length()), "substring(...)");
            }
        } else {
            String simpleName = getClass().getSimpleName();
            int length2 = simpleName.length();
            p013kotlin.jvm.internal.s.h(simpleName);
            if (length2 > 23) {
                p013kotlin.jvm.internal.s.j(simpleName.substring(0, 23), "substring(...)");
            }
        }
        Objects.toString(list);
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (obj2 instanceof C4288t3) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList(p013kotlin.collections.v.y(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(Long.valueOf(((C4288t3) it.next()).getTimestamp()));
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : arrayList2) {
            if (((Number) obj3).longValue() > getRecordingStartTimestamp()) {
                arrayList3.add(obj3);
            }
        }
        Iterator it2 = arrayList3.iterator();
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
        Long l11 = (Long) obj;
        if (l11 != null) {
            return l11.longValue();
        }
        throw AbstractC4277s.e.f38823a;
    }

    public final long getRecordingStartTimestamp() throws AbstractC4277s.e {
        AbstractC4316x3 abstractC4316x3Previous;
        List<AbstractC4316x3> metadataEvents = getMetadataEvents();
        ListIterator<AbstractC4316x3> listIterator = metadataEvents.listIterator(metadataEvents.size());
        do {
            if (!listIterator.hasPrevious()) {
                abstractC4316x3Previous = null;
                break;
            }
            abstractC4316x3Previous = listIterator.previous();
        } while (!(abstractC4316x3Previous instanceof C4302v3));
        AbstractC4316x3 abstractC4316x3 = abstractC4316x3Previous;
        if (abstractC4316x3 != null) {
            return abstractC4316x3.getTimestamp();
        }
        throw AbstractC4277s.e.f38823a;
    }

    protected abstract long getTrimmedVideoStartMs(List<? extends AbstractC4316x3> list);

    @Override // com.fourthline.vision.internal.InterfaceC4306w0
    public void subscribe(wn0.p<? super Pair<Long, Long>, ? super Continuation<? super jn0.h0>, ? extends Object> pVar) {
        InterfaceC4306w0.a.subscribe(this, pVar);
    }

    @Override // com.fourthline.vision.internal.InterfaceC4306w0
    public Pair<Long, Long> get() {
        long recordingEndTimestamp = getRecordingEndTimestamp() - getRecordingStartTimestamp();
        long trimmedVideoStartMs = getTrimmedVideoStartMs(getMetadataEvents());
        if (trimmedVideoStartMs < 0) {
            trimmedVideoStartMs = 0;
        }
        long jLongValue = ((Number) this.f38401b.invoke()).longValue() + trimmedVideoStartMs;
        if (recordingEndTimestamp >= jLongValue) {
            recordingEndTimestamp = jLongValue;
        }
        Long lValueOf = Long.valueOf(trimmedVideoStartMs);
        Long lValueOf2 = Long.valueOf(recordingEndTimestamp);
        if (getClass().isAnonymousClass()) {
            String name = getClass().getName();
            int length = name.length();
            p013kotlin.jvm.internal.s.h(name);
            if (length > 23) {
                p013kotlin.jvm.internal.s.j(name.substring(name.length() - 23, name.length()), "substring(...)");
            }
        } else {
            String simpleName = getClass().getSimpleName();
            int length2 = simpleName.length();
            p013kotlin.jvm.internal.s.h(simpleName);
            if (length2 > 23) {
                p013kotlin.jvm.internal.s.j(simpleName.substring(0, 23), "substring(...)");
            }
        }
        return jn0.x.a(lValueOf, lValueOf2);
    }
}
