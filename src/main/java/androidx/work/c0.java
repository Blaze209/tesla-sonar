package androidx.work;

import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00062\u00020\u0001:\u0002\u0007\bB\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Landroidx/work/c0;", "Landroidx/work/u0;", "Landroidx/work/c0$a;", "builder", "<init>", "(Landroidx/work/c0$a;)V", "e", "a", "b", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c0 extends u0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0010¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\u00008PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Landroidx/work/c0$a;", "Landroidx/work/u0$a;", "Landroidx/work/c0;", "Ljava/lang/Class;", "Landroidx/work/y;", "workerClass", "<init>", "(Ljava/lang/Class;)V", "o", "()Landroidx/work/c0;", "p", "()Landroidx/work/c0$a;", "thisObject", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends u0.a<a, c0> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Class<? extends y> workerClass) {
            super(workerClass);
            p013kotlin.jvm.internal.s.k(workerClass, "workerClass");
        }

        @Override // androidx.work.u0.a
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public c0 c() {
            if (getBackoffCriteriaSet() && getWorkSpec().org.bouncycastle.crypto.CryptoServicesPermission.CONSTRAINTS java.lang.String.getRequiresDeviceIdle()) {
                throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
            }
            return new c0(this);
        }

        @Override // androidx.work.u0.a
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public a g() {
            return this;
        }
    }

    /* JADX INFO: renamed from: androidx.work.c0$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/work/c0$b;", "", "<init>", "()V", "Ljava/lang/Class;", "Landroidx/work/y;", "workerClass", "Landroidx/work/c0;", "a", "(Ljava/lang/Class;)Landroidx/work/c0;", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final c0 a(Class<? extends y> workerClass) {
            p013kotlin.jvm.internal.s.k(workerClass, "workerClass");
            return new a(workerClass).b();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(a builder) {
        super(builder.getId(), builder.getWorkSpec(), builder.f());
        p013kotlin.jvm.internal.s.k(builder, "builder");
    }

    public static final c0 e(Class<? extends y> cls) {
        return INSTANCE.a(cls);
    }
}
