package p020r2;

import android.os.Looper;
import android.util.Log;
import b3.g;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import jn0.m;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.u;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0002\u001a1\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0001\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0001\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u001f\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0000¢\u0006\u0004\b\u0018\u0010\u0019\"!\u0010 \u001a\u00020\u001a8FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b\u0011\u0010\u001b\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u001d\"\u001a\u0010#\u001a\u00020\u000b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010!\u001a\u0004\b\u0016\u0010\"*\f\b\u0000\u0010%\"\u00020$2\u00020$¨\u0006&"}, d2 = {"T", "value", "Lr2/m3;", "policy", "Lb3/g;", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/Object;Lr2/m3;)Lb3/g;", "", "Lr2/m1;", "b", "(I)Lr2/m1;", "", "Lr2/n1;", "c", "(J)Lr2/n1;", "", "Lr2/l1;", "a", "(F)Lr2/l1;", "", "message", "", "e", "Ljn0/h0;", "f", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "Lr2/f1;", "Lkotlin/Lazy;", "getDefaultMonotonicFrameClock", "()Lr2/f1;", "getDefaultMonotonicFrameClock$annotations", "()V", "DefaultMonotonicFrameClock", "J", "()J", "MainThreadId", "", "CheckResult", "runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Lazy f106487a = m.b(a.f106489c);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f106488b;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lr2/f1;", "b", "()Lr2/f1;"}, k = 3, mv = {1, 8, 0})
    static final class a extends u implements wn0.a<f1> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f106489c = new a();

        a() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final f1 invoke() {
            return Looper.getMainLooper() != null ? f0.f106531a : x2.f106875a;
        }
    }

    static {
        long id2;
        try {
            id2 = Looper.getMainLooper().getThread().getId();
        } catch (Exception unused) {
            id2 = -1;
        }
        f106488b = id2;
    }

    public static final l1 a(float f11) {
        return new t1(f11);
    }

    public static final m1 b(int i11) {
        return new u1(i11);
    }

    public static final n1 c(long j11) {
        return new v1(j11);
    }

    public static final <T> g<T> d(T t11, m3<T> m3Var) {
        return new w1(t11, m3Var);
    }

    public static final long e() {
        return f106488b;
    }

    public static final void f(String str, Throwable th2) {
        Log.e("ComposeInternal", str, th2);
    }
}
