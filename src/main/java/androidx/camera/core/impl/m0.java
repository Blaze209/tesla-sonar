package androidx.camera.core.impl;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class m0 implements w2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c0.k1 f3230d;

    class a implements c0.k1 {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f3231d;

        a(long j11) {
            this.f3231d = j11;
        }

        @Override // c0.k1
        public long a() {
            return this.f3231d;
        }

        @Override // c0.k1
        @NonNull
        public c0.k1.c e(@NonNull c0.k1.b bVar) {
            return bVar.getStatus() == 1 ? c0.k1.c.f18351d : c0.k1.c.f18352e;
        }
    }

    public static final class b implements w2 {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final c0.k1 f3233d;

        public b(long j11) {
            this.f3233d = new m0(j11);
        }

        @Override // c0.k1
        public long a() {
            return this.f3233d.a();
        }

        @Override // androidx.camera.core.impl.w2
        @NonNull
        public c0.k1 b(long j11) {
            return new b(j11);
        }

        @Override // c0.k1
        @NonNull
        public c0.k1.c e(@NonNull c0.k1.b bVar) {
            if (this.f3233d.e(bVar).d()) {
                return c0.k1.c.f18352e;
            }
            Throwable cause = bVar.getCause();
            if (cause instanceof CameraValidator.CameraIdListIncorrectException) {
                c0.y0.c("CameraX", "The device might underreport the amount of the cameras. Finish the initialize task since we are already reaching the maximum number of retries.");
                if (((CameraValidator.CameraIdListIncorrectException) cause).a() > 0) {
                    return c0.k1.c.f18354g;
                }
            }
            return c0.k1.c.f18351d;
        }
    }

    public m0(long j11) {
        this.f3230d = new i3(j11, new a(j11));
    }

    @Override // c0.k1
    public long a() {
        return this.f3230d.a();
    }

    @Override // androidx.camera.core.impl.w2
    @NonNull
    public c0.k1 b(long j11) {
        return new m0(j11);
    }

    @Override // c0.k1
    @NonNull
    public c0.k1.c e(@NonNull c0.k1.b bVar) {
        return this.f3230d.e(bVar);
    }
}
