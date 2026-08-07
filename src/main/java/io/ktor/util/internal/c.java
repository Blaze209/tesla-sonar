package io.ktor.util.internal;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\u001a\u0017\u0010\u0003\u001a\u00060\u0001j\u0002`\u0002*\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004\" \u0010\n\u001a\u00020\u00008\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0005\u0012\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007\" \u0010\u000e\u001a\u00020\u00008\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010\u0005\u0012\u0004\b\r\u0010\t\u001a\u0004\b\f\u0010\u0007\" \u0010\u0012\u001a\u00020\u00008\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010\u0005\u0012\u0004\b\u0011\u0010\t\u001a\u0004\b\u0010\u0010\u0007\"\u0014\u0010\u0014\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0005\"\u0014\u0010\u0016\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0005*\n\u0010\u0017\"\u00020\u00002\u00020\u0000*\u001c\u0010\u0019\u001a\u0004\b\u0000\u0010\u0018\"\b\u0012\u0004\u0012\u00028\u00000\u00002\b\u0012\u0004\u0012\u00028\u00000\u0000*\f\b\u0002\u0010\u001a\"\u00020\u00012\u00020\u0001*\u001c\u0010\u001b\u001a\u0004\b\u0000\u0010\u0018\"\b\u0012\u0004\u0012\u00028\u00000\u00002\b\u0012\u0004\u0012\u00028\u00000\u0000¨\u0006\u001c"}, d2 = {"", "Lio/ktor/util/internal/d;", "Lio/ktor/util/internal/Node;", "a", "(Ljava/lang/Object;)Lio/ktor/util/internal/d;", "Ljava/lang/Object;", "getCONDITION_FALSE", "()Ljava/lang/Object;", "getCONDITION_FALSE$annotations", "()V", "CONDITION_FALSE", "b", "getALREADY_REMOVED", "getALREADY_REMOVED$annotations", "ALREADY_REMOVED", "c", "getLIST_EMPTY", "getLIST_EMPTY$annotations", "LIST_EMPTY", DateTokenConverter.CONVERTER_KEY, "REMOVE_PREPARED", "e", "NO_DECISION", "AbstractAtomicDesc", "T", "AddLastDesc", "Node", "RemoveFirstDesc", "ktor-utils"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f78521a = new g("CONDITION_FALSE");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f78522b = new g("ALREADY_REMOVED");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f78523c = new g("LIST_EMPTY");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Object f78524d = new g("REMOVE_PREPARED");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Object f78525e = new g("NO_DECISION");

    public static final d a(Object obj) {
        d dVar;
        s.k(obj, "<this>");
        f fVar = obj instanceof f ? (f) obj : null;
        return (fVar == null || (dVar = fVar.ch.qos.logback.core.joran.action.ActionConst.REF_ATTRIBUTE java.lang.String) == null) ? (d) obj : dVar;
    }
}
