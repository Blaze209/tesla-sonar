package n40;

import com.google.android.gms.common.Scopes;
import com.stripe.android.model.ConsumerSession;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.enums.EnumEntries;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0010B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\t\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ \u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u000bH\u0086@¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\u0010\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u000bH\u0086@¢\u0006\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Ln40/l;", "", "Lt50/j;", "consumerSessionRepository", "<init>", "(Lt50/j;)V", "", "Lcom/stripe/android/model/t1;", "verificationCode", "c", "(Ljava/lang/Throwable;Lcom/stripe/android/model/t1;)Ljava/lang/Throwable;", "", "consumerSessionClientSecret", "Lcom/stripe/android/model/t;", "b", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "Lt50/j;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final t50.j consumerSessionRepository;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\r\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\b\u0010\f¨\u0006\u000e"}, d2 = {"Ln40/l$a;", "", "", "message", "Ln40/l$a$a;", "type", "<init>", "(Ljava/lang/String;Ln40/l$a$a;)V", "a", "Ln40/l$a$a;", "b", "()Ln40/l$a$a;", "()Ljava/lang/String;", "supportUrl", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends Throwable {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final EnumC1986a type;

        /* JADX INFO: renamed from: n40.l$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Ln40/l$a$a;", "", "<init>", "(Ljava/lang/String;I)V", "EMAIL_CODE_EXPIRED", "SMS_CODE_EXPIRED", "CODE_INVALID", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public enum EnumC1986a {
            EMAIL_CODE_EXPIRED,
            SMS_CODE_EXPIRED,
            CODE_INVALID;

            private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

            public static EnumEntries<EnumC1986a> getEntries() {
                return $ENTRIES;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String message, EnumC1986a type) {
            super(message);
            p013kotlin.jvm.internal.s.k(message, "message");
            p013kotlin.jvm.internal.s.k(type, "type");
            this.type = type;
        }

        public final String a() {
            return "https://support.link.co/contact/email?skipVerification=true";
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final EnumC1986a getType() {
            return this.type;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f93163a;

        static {
            int[] iArr = new int[com.stripe.android.model.t1.values().length];
            try {
                iArr[com.stripe.android.model.t1.EMAIL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[com.stripe.android.model.t1.SMS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f93163a = iArr;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.domain.ConfirmVerification", f = "ConfirmVerification.kt", i = {0}, l = {31}, m = Scopes.EMAIL, n = {"this"}, s = {"L$0"})
    static final class c extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f93164n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f93165o;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f93167q;

        c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f93165o = obj;
            this.f93167q |= Integer.MIN_VALUE;
            return l.this.a(null, null, this);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.domain.ConfirmVerification", f = "ConfirmVerification.kt", i = {0}, l = {17}, m = "sms", n = {"this"}, s = {"L$0"})
    static final class d extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f93168n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f93169o;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f93171q;

        d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f93169o = obj;
            this.f93171q |= Integer.MIN_VALUE;
            return l.this.b(null, null, this);
        }
    }

    public l(t50.j consumerSessionRepository) {
        p013kotlin.jvm.internal.s.k(consumerSessionRepository, "consumerSessionRepository");
        this.consumerSessionRepository = consumerSessionRepository;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0027, code lost:
    
        if (r0.equals("consumer_verification_max_attempts_exceeded") == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0041, code lost:
    
        if (r0.equals("consumer_verification_expired") == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x004a, code lost:
    
        if (r0.equals("consumer_session_expired") == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x004d, code lost:
    
        r3 = n40.l.b.f93163a[r4.ordinal()];
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0056, code lost:
    
        if (r3 == 1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0059, code lost:
    
        if (r3 != 2) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0062, code lost:
    
        return new n40.l.a(r0, n40.l.a.EnumC1986a.SMS_CODE_EXPIRED);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0068, code lost:
    
        throw new p013kotlin.NoWhenBranchMatchedException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0070, code lost:
    
        return new n40.l.a(r0, n40.l.a.EnumC1986a.EMAIL_CODE_EXPIRED);
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Throwable c(java.lang.Throwable r3, com.stripe.android.model.t1 r4) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof com.stripe.android.core.exception.StripeException
            if (r0 == 0) goto L8
            r0 = r3
            com.stripe.android.core.exception.StripeException r0 = (com.stripe.android.core.exception.StripeException) r0
            goto L9
        L8:
            r0 = 0
        L9:
            if (r0 == 0) goto L17
            o30.f r0 = r0.getStripeError()
            if (r0 == 0) goto L17
            java.lang.String r0 = r0.getCode()
            if (r0 != 0) goto L19
        L17:
            java.lang.String r0 = ""
        L19:
            int r1 = r0.hashCode()
            switch(r1) {
                case -1200814029: goto L44;
                case -743856726: goto L3b;
                case -446933440: goto L2a;
                case 1449761750: goto L21;
                default: goto L20;
            }
        L20:
            goto L4c
        L21:
            java.lang.String r1 = "consumer_verification_max_attempts_exceeded"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L4d
            goto L4c
        L2a:
            java.lang.String r4 = "consumer_verification_code_invalid"
            boolean r4 = r0.equals(r4)
            if (r4 != 0) goto L33
            goto L4c
        L33:
            n40.l$a r3 = new n40.l$a
            n40.l$a$a r4 = n40.l.a.EnumC1986a.CODE_INVALID
            r3.<init>(r0, r4)
            return r3
        L3b:
            java.lang.String r1 = "consumer_verification_expired"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L4d
            goto L4c
        L44:
            java.lang.String r1 = "consumer_session_expired"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L4d
        L4c:
            return r3
        L4d:
            int[] r3 = n40.l.b.f93163a
            int r4 = r4.ordinal()
            r3 = r3[r4]
            r4 = 1
            if (r3 == r4) goto L69
            r4 = 2
            if (r3 != r4) goto L63
            n40.l$a r3 = new n40.l$a
            n40.l$a$a r4 = n40.l.a.EnumC1986a.SMS_CODE_EXPIRED
            r3.<init>(r0, r4)
            return r3
        L63:
            kotlin.NoWhenBranchMatchedException r3 = new kotlin.NoWhenBranchMatchedException
            r3.<init>()
            throw r3
        L69:
            n40.l$a r3 = new n40.l$a
            n40.l$a$a r4 = n40.l.a.EnumC1986a.EMAIL_CODE_EXPIRED
            r3.<init>(r0, r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: n40.l.c(java.lang.Throwable, com.stripe.android.model.t1):java.lang.Throwable");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, String str2, Continuation<? super ConsumerSession> continuation) throws Throwable {
        c cVar;
        l lVar;
        Object objB;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i11 = cVar.f93167q;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                cVar.f93167q = i11 - Integer.MIN_VALUE;
            } else {
                cVar = new c(continuation);
            }
        } else {
            cVar = new c(continuation);
        }
        Object objE = cVar.f93165o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = cVar.f93167q;
        if (i12 == 0) {
            jn0.t.b(objE);
            try {
                jn0.s.Companion companion = jn0.s.INSTANCE;
                t50.j jVar = this.consumerSessionRepository;
                com.stripe.android.model.t1 t1Var = com.stripe.android.model.t1.EMAIL;
                cVar.f93164n = this;
                cVar.f93167q = 1;
                objE = jVar.e(str, str2, t1Var, cVar);
                if (objE == coroutine_suspended) {
                    return coroutine_suspended;
                }
                lVar = this;
            } catch (Throwable th2) {
                th = th2;
                lVar = this;
                jn0.s.Companion companion2 = jn0.s.INSTANCE;
                objB = jn0.s.b(jn0.t.a(th));
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            lVar = (l) cVar.f93164n;
            try {
                jn0.t.b(objE);
            } catch (Throwable th3) {
                th = th3;
                jn0.s.Companion companion3 = jn0.s.INSTANCE;
                objB = jn0.s.b(jn0.t.a(th));
            }
        }
        objB = jn0.s.b((ConsumerSession) objE);
        Throwable thE = jn0.s.e(objB);
        if (thE == null) {
            return (ConsumerSession) objB;
        }
        throw lVar.c(thE, com.stripe.android.model.t1.EMAIL);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(String str, String str2, Continuation<? super ConsumerSession> continuation) throws Throwable {
        d dVar;
        l lVar;
        Object objB;
        if (continuation instanceof d) {
            dVar = (d) continuation;
            int i11 = dVar.f93171q;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                dVar.f93171q = i11 - Integer.MIN_VALUE;
            } else {
                dVar = new d(continuation);
            }
        } else {
            dVar = new d(continuation);
        }
        Object objE = dVar.f93169o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = dVar.f93171q;
        if (i12 == 0) {
            jn0.t.b(objE);
            try {
                jn0.s.Companion companion = jn0.s.INSTANCE;
                t50.j jVar = this.consumerSessionRepository;
                com.stripe.android.model.t1 t1Var = com.stripe.android.model.t1.SMS;
                dVar.f93168n = this;
                dVar.f93171q = 1;
                objE = jVar.e(str, str2, t1Var, dVar);
                if (objE == coroutine_suspended) {
                    return coroutine_suspended;
                }
                lVar = this;
            } catch (Throwable th2) {
                th = th2;
                lVar = this;
                jn0.s.Companion companion2 = jn0.s.INSTANCE;
                objB = jn0.s.b(jn0.t.a(th));
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            lVar = (l) dVar.f93168n;
            try {
                jn0.t.b(objE);
            } catch (Throwable th3) {
                th = th3;
                jn0.s.Companion companion3 = jn0.s.INSTANCE;
                objB = jn0.s.b(jn0.t.a(th));
            }
        }
        objB = jn0.s.b((ConsumerSession) objE);
        Throwable thE = jn0.s.e(objB);
        if (thE == null) {
            return (ConsumerSession) objB;
        }
        throw lVar.c(thE, com.stripe.android.model.t1.SMS);
    }
}
