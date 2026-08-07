package p014n4;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import jn0.h0;
import jn0.t;
import m4.b;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.jvm.internal.s;
import q4.u;
import q4.v;
import wn0.l;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0002\u0016\u001bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ%\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010JJ\u0010\u0014\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u001e\u0010\u0013\u001a\u001a\b\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0011H\u0086@¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0018\u001a\u00020\u000e8\u0002X\u0082\u0004ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R \u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u000e0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR \u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u000e0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010$\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010#\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006%"}, d2 = {"Ln4/m;", "", "<init>", "()V", "Ln4/p;", "font", "Ln4/m0;", "platformFontLoader", "result", "", "forever", "Ljn0/h0;", "e", "(Ln4/p;Ln4/m0;Ljava/lang/Object;Z)V", "Ln4/m$a;", DateTokenConverter.CONVERTER_KEY, "(Ln4/p;Ln4/m0;)Ln4/m$a;", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "block", "g", "(Ln4/p;Ln4/m0;ZLwn0/l;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "Ljava/lang/Object;", "PermanentFailure", "Lm4/b;", "Ln4/m$b;", "b", "Lm4/b;", "resultCache", "Lm4/c;", "c", "Lm4/c;", "permanentCache", "Lq4/v;", "Lq4/v;", "cacheLock", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Object PermanentFailure = a.b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final b<Key, a> resultCache = new b<>(16);

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final m4.c<Key, a> permanentCache = new m4.c<>(0, 1, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final v cacheLock = u.a();

    /* JADX INFO: renamed from: n4.m$b, reason: from toString */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0080\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Ln4/m$b;", "", "Ln4/p;", "font", "loaderKey", "<init>", "(Ln4/p;Ljava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ln4/p;", "getFont", "()Ln4/p;", "b", "Ljava/lang/Object;", "getLoaderKey", "()Ljava/lang/Object;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Key {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final p font;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Object loaderKey;

        public Key(p pVar, Object obj) {
            this.font = pVar;
            this.loaderKey = obj;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Key)) {
                return false;
            }
            Key key = (Key) other;
            return s.f(this.font, key.font) && s.f(this.loaderKey, key.loaderKey);
        }

        public int hashCode() {
            int iHashCode = this.font.hashCode() * 31;
            Object obj = this.loaderKey;
            return iHashCode + (obj == null ? 0 : obj.hashCode());
        }

        public String toString() {
            return "Key(font=" + this.font + ", loaderKey=" + this.loaderKey + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.ui.text.font.AsyncTypefaceCache", f = "FontListFontFamilyTypefaceAdapter.kt", i = {0, 0, 0}, l = {398}, m = "runCached", n = {"this", Action.KEY_ATTRIBUTE, "forever"}, s = {"L$0", "L$1", "Z$0"})
    static final class c extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f92993n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f92994o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        boolean f92995p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        /* synthetic */ Object f92996q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f92998s;

        c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f92996q = obj;
            this.f92998s |= Integer.MIN_VALUE;
            return m.this.g(null, null, false, null, this);
        }
    }

    public static /* synthetic */ void f(m mVar, p pVar, m0 m0Var, Object obj, boolean z11, int i11, Object obj2) {
        if ((i11 & 8) != 0) {
            z11 = false;
        }
        mVar.e(pVar, m0Var, obj, z11);
    }

    public final a d(p font, m0 platformFontLoader) {
        a aVarD;
        Key key = new Key(font, platformFontLoader.c());
        synchronized (this.cacheLock) {
            aVarD = this.resultCache.d(key);
            if (aVarD == null) {
                aVarD = this.permanentCache.b(key);
            }
        }
        return aVarD;
    }

    public final void e(p font, m0 platformFontLoader, Object result, boolean forever) {
        Key key = new Key(font, platformFontLoader.c());
        synchronized (this.cacheLock) {
            try {
                if (result == null) {
                    this.permanentCache.h(key, a.a(this.PermanentFailure));
                } else if (forever) {
                    this.permanentCache.h(key, a.a(a.b(result)));
                } else {
                    this.resultCache.e(key, a.a(a.b(result)));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(p pVar, m0 m0Var, boolean z11, l<? super Continuation<Object>, ? extends Object> lVar, Continuation<Object> continuation) {
        c cVar;
        Key key;
        m mVar;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i11 = cVar.f92998s;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                cVar.f92998s = i11 - Integer.MIN_VALUE;
            } else {
                cVar = new c(continuation);
            }
        } else {
            cVar = new c(continuation);
        }
        Object obj = cVar.f92996q;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = cVar.f92998s;
        if (i12 == 0) {
            t.b(obj);
            Key key2 = new Key(pVar, m0Var.c());
            synchronized (this.cacheLock) {
                try {
                    a aVarD = this.resultCache.d(key2);
                    if (aVarD == null) {
                        aVarD = this.permanentCache.b(key2);
                    }
                    if (aVarD != null) {
                        return aVarD.getResult();
                    }
                    h0 h0Var = h0.f84049a;
                    cVar.f92993n = this;
                    cVar.f92994o = key2;
                    cVar.f92995p = z11;
                    cVar.f92998s = 1;
                    Object objInvoke = lVar.invoke(cVar);
                    if (objInvoke == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    obj = objInvoke;
                    key = key2;
                    mVar = this;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z11 = cVar.f92995p;
            key = (Key) cVar.f92994o;
            mVar = (m) cVar.f92993n;
            t.b(obj);
        }
        synchronized (mVar.cacheLock) {
            try {
                if (obj == null) {
                    mVar.permanentCache.h(key, a.a(mVar.PermanentFailure));
                } else if (z11) {
                    mVar.permanentCache.h(key, a.a(a.b(obj)));
                } else {
                    mVar.resultCache.e(key, a.a(a.b(obj)));
                }
                h0 h0Var2 = h0.f84049a;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return obj;
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0081@\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0015\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014\u0088\u0001\u0002\u0092\u0001\u0004\u0018\u00010\u0001¨\u0006\u0016"}, d2 = {"Ln4/m$a;", "", "result", "b", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "f", "(Ljava/lang/Object;)Ljava/lang/String;", "", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/Object;)I", "other", "", "c", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "a", "Ljava/lang/Object;", "getResult", "()Ljava/lang/Object;", "e", "(Ljava/lang/Object;)Z", "isPermanentFailure", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @vn0.b
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Object result;

        private /* synthetic */ a(Object obj) {
            this.result = obj;
        }

        public static final /* synthetic */ a a(Object obj) {
            return new a(obj);
        }

        public static boolean c(Object obj, Object obj2) {
            return (obj2 instanceof a) && s.f(obj, ((a) obj2).getResult());
        }

        public static int d(Object obj) {
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        public static final boolean e(Object obj) {
            return obj == null;
        }

        public static String f(Object obj) {
            return "AsyncTypefaceResult(result=" + obj + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        public boolean equals(Object obj) {
            return c(this.result, obj);
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final /* synthetic */ Object getResult() {
            return this.result;
        }

        public int hashCode() {
            return d(this.result);
        }

        public String toString() {
            return f(this.result);
        }

        public static Object b(Object obj) {
            return obj;
        }
    }
}
