package nh0;

import androidx.p002activity.result.ActivityResultLauncher;

/* JADX INFO: loaded from: classes8.dex */
public final class i implements qj0.e<ActivityResultLauncher<PassportNfcReaderConfig>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f95026a;

    public i(f fVar) {
        this.f95026a = fVar;
    }

    public static i a(f fVar) {
        return new i(fVar);
    }

    public static ActivityResultLauncher<PassportNfcReaderConfig> c(f fVar) {
        return (ActivityResultLauncher) qj0.h.d(fVar.a());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ActivityResultLauncher<PassportNfcReaderConfig> get() {
        return c(this.f95026a);
    }
}
