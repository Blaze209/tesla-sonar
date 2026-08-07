package xf;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p020r2.n3;
import p020r2.p1;
import p020r2.s3;
import p020r2.y3;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\r\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR/\u0010\u0017\u001a\u0004\u0018\u00010\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u00048V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\bR/\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u0011\u001a\u0004\u0018\u00010\t8V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\fR\u001b\u0010\u001f\u001a\u00020\u001c8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001b\u0010#\u001a\u00020\u001c8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u001e\u001a\u0004\b\"\u0010 R\u001b\u0010%\u001a\u00020\u001c8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u001e\u001a\u0004\b%\u0010 R\u001b\u0010(\u001a\u00020\u001c8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b&\u0010\u001e\u001a\u0004\b'\u0010 ¨\u0006)"}, d2 = {"Lxf/l;", "Lxf/k;", "<init>", "()V", "Ltf/i;", "composition", "Ljn0/h0;", "k", "(Ltf/i;)V", "", AnalyticsAttribute.Error, "n", "(Ljava/lang/Throwable;)V", "Lkotlinx/coroutines/CompletableDeferred;", "a", "Lkotlinx/coroutines/CompletableDeferred;", "compositionDeferred", "<set-?>", "b", "Lr2/p1;", "p", "()Ltf/i;", "B", "value", "c", "o", "()Ljava/lang/Throwable;", "u", "", DateTokenConverter.CONVERTER_KEY, "Lr2/y3;", "isLoading", "()Z", "e", "q", "isComplete", "f", "isFailure", "g", "t", "isSuccess", "lottie-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class l implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final CompletableDeferred<tf.i> compositionDeferred = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final p1 value = s3.d(null, null, 2, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final p1 error = s3.d(null, null, 2, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final y3 isLoading = n3.e(new c());

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final y3 isComplete = n3.e(new a());

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final y3 isFailure = n3.e(new b());

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final y3 isSuccess = n3.e(new d());

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    static final class a extends u implements wn0.a<Boolean> {
        a() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf((l.this.getValue() == null && l.this.o() == null) ? false : true);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    static final class b extends u implements wn0.a<Boolean> {
        b() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(l.this.o() != null);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    static final class c extends u implements wn0.a<Boolean> {
        c() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(l.this.getValue() == null && l.this.o() == null);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    static final class d extends u implements wn0.a<Boolean> {
        d() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(l.this.getValue() != null);
        }
    }

    private void B(tf.i iVar) {
        this.value.setValue(iVar);
    }

    private void u(Throwable th2) {
        this.error.setValue(th2);
    }

    public final synchronized void k(tf.i composition) {
        s.k(composition, "composition");
        if (q()) {
            return;
        }
        B(composition);
        this.compositionDeferred.complete(composition);
    }

    public final synchronized void n(Throwable error) {
        s.k(error, "error");
        if (q()) {
            return;
        }
        u(error);
        this.compositionDeferred.completeExceptionally(error);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Throwable o() {
        return (Throwable) this.error.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p020r2.y3
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public tf.i getValue() {
        return (tf.i) this.value.getValue();
    }

    public boolean q() {
        return ((Boolean) this.isComplete.getValue()).booleanValue();
    }

    public boolean t() {
        return ((Boolean) this.isSuccess.getValue()).booleanValue();
    }
}
