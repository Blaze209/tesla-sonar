package yw;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u0000 \u00162\u00020\u0001:\u0001\u0013B\u001d\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010H\u0086@¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R\u0011\u0010\u0018\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\b\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0019R\u0011\u0010\r\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u001a¨\u0006\u001b"}, d2 = {"Lyw/j;", "", "Lyw/o;", "localOverrideSettings", "remoteSettings", "<init>", "(Lyw/o;Lyw/o;)V", "", "samplingRate", "", DateTokenConverter.CONVERTER_KEY, "(D)Z", "Lio0/b;", "sessionRestartTimeout", "e", "(J)Z", "Ljn0/h0;", "f", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "Lyw/o;", "b", "c", "()Z", "sessionsEnabled", "()D", "()J", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final o localOverrideSettings;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final o remoteSettings;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.google.firebase.sessions.settings.SessionsSettings", f = "SessionsSettings.kt", i = {0}, l = {98, 99}, m = "updateSettings", n = {"this"}, s = {"L$0"})
    static final class b extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f125935n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f125936o;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f125938q;

        b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f125936o = obj;
            this.f125938q |= Integer.MIN_VALUE;
            return j.this.f(this);
        }
    }

    public j(o localOverrideSettings, o remoteSettings) {
        s.k(localOverrideSettings, "localOverrideSettings");
        s.k(remoteSettings, "remoteSettings");
        this.localOverrideSettings = localOverrideSettings;
        this.remoteSettings = remoteSettings;
    }

    private final boolean d(double samplingRate) {
        return 0.0d <= samplingRate && samplingRate <= 1.0d;
    }

    private final boolean e(long sessionRestartTimeout) {
        return io0.b.D(sessionRestartTimeout) && io0.b.y(sessionRestartTimeout);
    }

    public final double a() {
        Double dA = this.localOverrideSettings.a();
        if (dA != null) {
            double dDoubleValue = dA.doubleValue();
            if (d(dDoubleValue)) {
                return dDoubleValue;
            }
        }
        Double dA2 = this.remoteSettings.a();
        if (dA2 == null) {
            return 1.0d;
        }
        double dDoubleValue2 = dA2.doubleValue();
        if (d(dDoubleValue2)) {
            return dDoubleValue2;
        }
        return 1.0d;
    }

    public final long b() {
        io0.b bVarD = this.localOverrideSettings.d();
        if (bVarD != null) {
            long rawValue = bVarD.getRawValue();
            if (e(rawValue)) {
                return rawValue;
            }
        }
        io0.b bVarD2 = this.remoteSettings.d();
        if (bVarD2 != null) {
            long rawValue2 = bVarD2.getRawValue();
            if (e(rawValue2)) {
                return rawValue2;
            }
        }
        io0.b.Companion companion = io0.b.INSTANCE;
        return io0.d.s(30, io0.e.MINUTES);
    }

    public final boolean c() {
        Boolean boolC = this.localOverrideSettings.c();
        if (boolC != null) {
            return boolC.booleanValue();
        }
        Boolean boolC2 = this.remoteSettings.c();
        if (boolC2 != null) {
            return boolC2.booleanValue();
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0058, code lost:
    
        if (r6.b(r0) == r1) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(p013kotlin.coroutines.Continuation<? super jn0.h0> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof yw.j.b
            if (r0 == 0) goto L13
            r0 = r6
            yw.j$b r0 = (yw.j.b) r0
            int r1 = r0.f125938q
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f125938q = r1
            goto L18
        L13:
            yw.j$b r0 = new yw.j$b
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f125936o
            java.lang.Object r1 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f125938q
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            jn0.t.b(r6)
            goto L5b
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            java.lang.Object r2 = r0.f125935n
            yw.j r2 = (yw.j) r2
            jn0.t.b(r6)
            goto L4d
        L3c:
            jn0.t.b(r6)
            yw.o r6 = r5.localOverrideSettings
            r0.f125935n = r5
            r0.f125938q = r4
            java.lang.Object r6 = r6.b(r0)
            if (r6 != r1) goto L4c
            goto L5a
        L4c:
            r2 = r5
        L4d:
            yw.o r6 = r2.remoteSettings
            r2 = 0
            r0.f125935n = r2
            r0.f125938q = r3
            java.lang.Object r6 = r6.b(r0)
            if (r6 != r1) goto L5b
        L5a:
            return r1
        L5b:
            jn0.h0 r6 = jn0.h0.f84049a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: yw.j.f(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
