package kotlinx.coroutines.internal;

import java.util.ArrayDeque;
import java.util.Iterator;
import jn0.s;
import jn0.t;
import jn0.x;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import p013kotlin.coroutines.jvm.internal.CoroutineStackFrame;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\u001a!\u0010\u0003\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001d\u0010\u0005\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00028\u0000H\u0002¢\u0006\u0004\b\u0005\u0010\u0004\u001a.\u0010\u0003\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u00002\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0006H\u0080\b¢\u0006\u0004\b\u0003\u0010\b\u001a-\u0010\u000b\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u00002\n\u0010\u0007\u001a\u00060\tj\u0002`\nH\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a;\u0010\u0013\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00028\u00002\u0010\u0010\u0012\u001a\f\u0012\b\u0012\u00060\u0010j\u0002`\u00110\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a3\u0010\u0017\u001a\u0018\u0012\u0004\u0012\u00028\u0000\u0012\u000e\u0012\f\u0012\b\u0012\u00060\u0010j\u0002`\u00110\u00160\u0015\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00028\u0000H\u0002¢\u0006\u0004\b\u0017\u0010\u0018\u001a3\u0010\u001b\u001a\u00020\u001a2\u0010\u0010\u0019\u001a\f\u0012\b\u0012\u00060\u0010j\u0002`\u00110\u00162\u0010\u0010\u000e\u001a\f\u0012\b\u0012\u00060\u0010j\u0002`\u00110\u000fH\u0002¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0018\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0002\u001a\u00020\u0000H\u0080H¢\u0006\u0004\b\u001e\u0010\u001f\u001a\"\u0010 \u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\u0081\b¢\u0006\u0004\b \u0010\u0004\u001a!\u0010!\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\u0001¢\u0006\u0004\b!\u0010\u0004\u001a%\u0010\"\u001a\f\u0012\b\u0012\u00060\u0010j\u0002`\u00110\u000f2\n\u0010\u0007\u001a\u00060\tj\u0002`\nH\u0002¢\u0006\u0004\b\"\u0010#\u001a\u0017\u0010%\u001a\u00020$*\u00060\u0010j\u0002`\u0011H\u0000¢\u0006\u0004\b%\u0010&\u001a%\u0010*\u001a\u00020)*\f\u0012\b\u0012\u00060\u0010j\u0002`\u00110\u00162\u0006\u0010(\u001a\u00020'H\u0002¢\u0006\u0004\b*\u0010+\u001a#\u0010-\u001a\u00020$*\u00060\u0010j\u0002`\u00112\n\u0010,\u001a\u00060\u0010j\u0002`\u0011H\u0002¢\u0006\u0004\b-\u0010.\u001a\u001b\u0010/\u001a\u00020\u001a*\u00020\u00002\u0006\u0010\r\u001a\u00020\u0000H\u0000¢\u0006\u0004\b/\u00100\"\u0014\u00101\u001a\u00020'8\u0002X\u0082T¢\u0006\u0006\n\u0004\b1\u00102\"\u0014\u00103\u001a\u00020'8\u0002X\u0082T¢\u0006\u0006\n\u0004\b3\u00102\"\u0014\u00104\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105\"\u001c\u00107\u001a\n 6*\u0004\u0018\u00010'0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00102\"\u001c\u00108\u001a\n 6*\u0004\u0018\u00010'0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00102*\f\b\u0000\u00109\"\u00020\t2\u00020\t*\f\b\u0000\u0010:\"\u00020\u00102\u00020\u0010¨\u0006;"}, d2 = {"", "E", "exception", "recoverStackTrace", "(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "sanitizeStackTrace", "Lkotlin/coroutines/Continuation;", "continuation", "(Ljava/lang/Throwable;Lkotlin/coroutines/Continuation;)Ljava/lang/Throwable;", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "recoverFromStackFrame", "(Ljava/lang/Throwable;Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;)Ljava/lang/Throwable;", "cause", "result", "Ljava/util/ArrayDeque;", "Ljava/lang/StackTraceElement;", "Lkotlinx/coroutines/internal/StackTraceElement;", "resultStackTrace", "createFinalException", "(Ljava/lang/Throwable;Ljava/lang/Throwable;Ljava/util/ArrayDeque;)Ljava/lang/Throwable;", "Lkotlin/Pair;", "", "causeAndStacktrace", "(Ljava/lang/Throwable;)Lkotlin/Pair;", "recoveredStacktrace", "Ljn0/h0;", "mergeRecoveredTraces", "([Ljava/lang/StackTraceElement;Ljava/util/ArrayDeque;)V", "", "recoverAndThrow", "(Ljava/lang/Throwable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unwrap", "unwrapImpl", "createStackTrace", "(Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;)Ljava/util/ArrayDeque;", "", "isArtificial", "(Ljava/lang/StackTraceElement;)Z", "", "methodName", "", "firstFrameIndex", "([Ljava/lang/StackTraceElement;Ljava/lang/String;)I", "e", "elementWiseEquals", "(Ljava/lang/StackTraceElement;Ljava/lang/StackTraceElement;)Z", "initCause", "(Ljava/lang/Throwable;Ljava/lang/Throwable;)V", "baseContinuationImplClass", "Ljava/lang/String;", "stackTraceRecoveryClass", "ARTIFICIAL_FRAME", "Ljava/lang/StackTraceElement;", "kotlin.jvm.PlatformType", "baseContinuationImplClassName", "stackTraceRecoveryClassName", "CoroutineStackFrame", "StackTraceElement", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class StackTraceRecoveryKt {
    private static final StackTraceElement ARTIFICIAL_FRAME = new b.a().a();
    private static final String baseContinuationImplClass = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
    private static final String baseContinuationImplClassName;
    private static final String stackTraceRecoveryClass = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
    private static final String stackTraceRecoveryClassName;

    static {
        Object objB;
        Object objB2;
        try {
            s.Companion companion = s.INSTANCE;
            objB = s.b(BaseContinuationImpl.class.getCanonicalName());
        } catch (Throwable th2) {
            s.Companion companion2 = s.INSTANCE;
            objB = s.b(t.a(th2));
        }
        if (s.e(objB) != null) {
            objB = baseContinuationImplClass;
        }
        baseContinuationImplClassName = (String) objB;
        try {
            objB2 = s.b(StackTraceRecoveryKt.class.getCanonicalName());
        } catch (Throwable th3) {
            s.Companion companion3 = s.INSTANCE;
            objB2 = s.b(t.a(th3));
        }
        if (s.e(objB2) != null) {
            objB2 = stackTraceRecoveryClass;
        }
        stackTraceRecoveryClassName = (String) objB2;
    }

    private static final <E extends Throwable> Pair<E, StackTraceElement[]> causeAndStacktrace(E e11) {
        Throwable cause = e11.getCause();
        if (cause == null || !p013kotlin.jvm.internal.s.f(cause.getClass(), e11.getClass())) {
            return x.a(e11, new StackTraceElement[0]);
        }
        StackTraceElement[] stackTrace = e11.getStackTrace();
        for (StackTraceElement stackTraceElement : stackTrace) {
            if (isArtificial(stackTraceElement)) {
                return x.a(cause, stackTrace);
            }
        }
        return x.a(e11, new StackTraceElement[0]);
    }

    private static final <E extends Throwable> E createFinalException(E e11, E e12, ArrayDeque<StackTraceElement> arrayDeque) {
        arrayDeque.addFirst(ARTIFICIAL_FRAME);
        StackTraceElement[] stackTrace = e11.getStackTrace();
        int iFirstFrameIndex = firstFrameIndex(stackTrace, baseContinuationImplClassName);
        int i11 = 0;
        if (iFirstFrameIndex == -1) {
            e12.setStackTrace((StackTraceElement[]) arrayDeque.toArray(new StackTraceElement[0]));
            return e12;
        }
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[arrayDeque.size() + iFirstFrameIndex];
        for (int i12 = 0; i12 < iFirstFrameIndex; i12++) {
            stackTraceElementArr[i12] = stackTrace[i12];
        }
        Iterator<T> it = arrayDeque.iterator();
        while (it.hasNext()) {
            stackTraceElementArr[i11 + iFirstFrameIndex] = (StackTraceElement) it.next();
            i11++;
        }
        e12.setStackTrace(stackTraceElementArr);
        return e12;
    }

    private static final ArrayDeque<StackTraceElement> createStackTrace(CoroutineStackFrame coroutineStackFrame) {
        ArrayDeque<StackTraceElement> arrayDeque = new ArrayDeque<>();
        StackTraceElement stackTraceElement = coroutineStackFrame.getStackTraceElement();
        if (stackTraceElement != null) {
            arrayDeque.add(stackTraceElement);
        }
        while (true) {
            coroutineStackFrame = coroutineStackFrame.getCallerFrame();
            if (coroutineStackFrame == null) {
                return arrayDeque;
            }
            StackTraceElement stackTraceElement2 = coroutineStackFrame.getStackTraceElement();
            if (stackTraceElement2 != null) {
                arrayDeque.add(stackTraceElement2);
            }
        }
    }

    private static final boolean elementWiseEquals(StackTraceElement stackTraceElement, StackTraceElement stackTraceElement2) {
        return stackTraceElement.getLineNumber() == stackTraceElement2.getLineNumber() && p013kotlin.jvm.internal.s.f(stackTraceElement.getMethodName(), stackTraceElement2.getMethodName()) && p013kotlin.jvm.internal.s.f(stackTraceElement.getFileName(), stackTraceElement2.getFileName()) && p013kotlin.jvm.internal.s.f(stackTraceElement.getClassName(), stackTraceElement2.getClassName());
    }

    private static final int firstFrameIndex(StackTraceElement[] stackTraceElementArr, String str) {
        int length = stackTraceElementArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (p013kotlin.jvm.internal.s.f(str, stackTraceElementArr[i11].getClassName())) {
                return i11;
            }
        }
        return -1;
    }

    public static final void initCause(Throwable th2, Throwable th3) {
        th2.initCause(th3);
    }

    public static final boolean isArtificial(StackTraceElement stackTraceElement) {
        return p013kotlin.text.t.b0(stackTraceElement.getClassName(), b.b.c(), false, 2, null);
    }

    private static final void mergeRecoveredTraces(StackTraceElement[] stackTraceElementArr, ArrayDeque<StackTraceElement> arrayDeque) {
        int length = stackTraceElementArr.length;
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                i11 = -1;
                break;
            } else if (isArtificial(stackTraceElementArr[i11])) {
                break;
            } else {
                i11++;
            }
        }
        int i12 = i11 + 1;
        int length2 = stackTraceElementArr.length - 1;
        if (i12 > length2) {
            return;
        }
        while (true) {
            if (elementWiseEquals(stackTraceElementArr[length2], arrayDeque.getLast())) {
                arrayDeque.removeLast();
            }
            arrayDeque.addFirst(stackTraceElementArr[length2]);
            if (length2 == i12) {
                return;
            } else {
                length2--;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <E extends Throwable> E recoverFromStackFrame(E e11, CoroutineStackFrame coroutineStackFrame) {
        Pair pairCauseAndStacktrace = causeAndStacktrace(e11);
        Throwable th2 = (Throwable) pairCauseAndStacktrace.a();
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) pairCauseAndStacktrace.b();
        Throwable thTryCopyException = ExceptionsConstructorKt.tryCopyException(th2);
        if (thTryCopyException != null) {
            ArrayDeque<StackTraceElement> arrayDequeCreateStackTrace = createStackTrace(coroutineStackFrame);
            if (!arrayDequeCreateStackTrace.isEmpty()) {
                if (th2 != e11) {
                    mergeRecoveredTraces(stackTraceElementArr, arrayDequeCreateStackTrace);
                }
                return (E) createFinalException(th2, thTryCopyException, arrayDequeCreateStackTrace);
            }
        }
        return e11;
    }

    public static final <E extends Throwable> E recoverStackTrace(E e11) {
        return e11;
    }

    private static final <E extends Throwable> E sanitizeStackTrace(E e11) {
        StackTraceElement[] stackTrace = e11.getStackTrace();
        int length = stackTrace.length;
        int length2 = stackTrace.length - 1;
        if (length2 < 0) {
            length2 = -1;
            break;
        }
        while (true) {
            int i11 = length2 - 1;
            if (p013kotlin.jvm.internal.s.f(stackTraceRecoveryClassName, stackTrace[length2].getClassName())) {
                break;
            }
            if (i11 < 0) {
                length2 = -1;
                break;
            }
            length2 = i11;
        }
        int i12 = length2 + 1;
        int iFirstFrameIndex = firstFrameIndex(stackTrace, baseContinuationImplClassName);
        int i13 = 0;
        int i14 = (length - length2) - (iFirstFrameIndex == -1 ? 0 : length - iFirstFrameIndex);
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[i14];
        while (i13 < i14) {
            stackTraceElementArr[i13] = i13 == 0 ? ARTIFICIAL_FRAME : stackTrace[(i12 + i13) - 1];
            i13++;
        }
        e11.setStackTrace(stackTraceElementArr);
        return e11;
    }

    public static final <E extends Throwable> E unwrap(E e11) {
        return e11;
    }

    public static final <E extends Throwable> E unwrapImpl(E e11) {
        E e12 = (E) e11.getCause();
        if (e12 != null && p013kotlin.jvm.internal.s.f(e12.getClass(), e11.getClass())) {
            for (StackTraceElement stackTraceElement : e11.getStackTrace()) {
                if (isArtificial(stackTraceElement)) {
                    return e12;
                }
            }
        }
        return e11;
    }

    public static final <E extends Throwable> E recoverStackTrace(E e11, Continuation<?> continuation) {
        return e11;
    }

    public static final Object recoverAndThrow(Throwable th2, Continuation<?> continuation) throws Throwable {
        throw th2;
    }

    private static final Object recoverAndThrow$$forInline(Throwable th2, Continuation<?> continuation) throws Throwable {
        throw th2;
    }
}
