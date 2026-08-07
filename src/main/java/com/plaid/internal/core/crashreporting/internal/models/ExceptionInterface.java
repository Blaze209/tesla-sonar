package com.plaid.internal.core.crashreporting.internal.models;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0015\b\u0012\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\bJ\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\nH\u0016R\u0011\u0010\t\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/plaid/internal/core/crashreporting/internal/models/ExceptionInterface;", "", "throwable", "", "(Ljava/lang/Throwable;)V", "exceptions", "Ljava/util/Queue;", "Lcom/plaid/internal/core/crashreporting/internal/models/ExceptionModel;", "(Ljava/util/Queue;)V", "interfaceName", "", "getInterfaceName", "()Ljava/lang/String;", "values", "equals", "", "other", "hashCode", "", "toString", "Companion", "crash-reporting_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ExceptionInterface {
    public static final String EXCEPTION_INTERFACE = "sentry.interfaces.Exception";
    private final Queue<ExceptionModel> values;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ExceptionInterface(Throwable throwable) {
        this(ExceptionModel.INSTANCE.extractExceptionQueue(throwable));
        s.k(throwable, "throwable");
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !s.f(ExceptionInterface.class, other.getClass())) {
            return false;
        }
        return s.f(this.values, ((ExceptionInterface) other).values);
    }

    public final String getInterfaceName() {
        return EXCEPTION_INTERFACE;
    }

    public int hashCode() {
        return this.values.hashCode();
    }

    public String toString() {
        return "ExceptionInterface{exceptions=" + this.values + "}";
    }

    private ExceptionInterface(Queue<ExceptionModel> queue) {
        List listR0 = v.R0(queue);
        LinkedList linkedList = new LinkedList();
        Iterator it = listR0.iterator();
        while (it.hasNext()) {
            linkedList.add((ExceptionModel) it.next());
        }
        this.values = linkedList;
    }
}
