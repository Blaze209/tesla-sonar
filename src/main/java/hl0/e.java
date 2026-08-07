package hl0;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import kotlinx.coroutines.CoroutineScope;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0004B\u000f\u0012\u0006\u0010\u0005\u001a\u00028\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\t\u001a\u00028\u00002\u0006\u0010\b\u001a\u00028\u0000H¦@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\u000b\u001a\u00028\u0000H¦@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000e\u001a\u00028\u00002\u0006\u0010\r\u001a\u00028\u0000H @ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\nR\u0017\u0010\u0005\u001a\u00028\u00018\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Lhl0/e;", "", "TSubject", "TContext", "Lkotlinx/coroutines/CoroutineScope;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Ljava/lang/Object;)V", "subject", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "c", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "initial", "a", "Ljava/lang/Object;", "b", "()Ljava/lang/Object;", "ktor-utils"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class e<TSubject, TContext> implements CoroutineScope {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final TContext context;

    public e(TContext context) {
        s.k(context, "context");
        this.context = context;
    }

    public abstract Object a(TSubject tsubject, Continuation<? super TSubject> continuation);

    public final TContext b() {
        return this.context;
    }

    public abstract Object c(Continuation<? super TSubject> continuation);

    public abstract Object d(TSubject tsubject, Continuation<? super TSubject> continuation);
}
