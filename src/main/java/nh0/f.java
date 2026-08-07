package nh0;

import androidx.p002activity.result.ActivityResultLauncher;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\t¨\u0006\n"}, d2 = {"Lnh0/f;", "", "Landroidx/activity/result/ActivityResultLauncher;", "Lnh0/e;", "passportNfcReaderLauncher", "<init>", "(Landroidx/activity/result/ActivityResultLauncher;)V", "a", "()Landroidx/activity/result/ActivityResultLauncher;", "Landroidx/activity/result/ActivityResultLauncher;", "nfc_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ActivityResultLauncher<PassportNfcReaderConfig> passportNfcReaderLauncher;

    public f(ActivityResultLauncher<PassportNfcReaderConfig> passportNfcReaderLauncher) {
        s.k(passportNfcReaderLauncher, "passportNfcReaderLauncher");
        this.passportNfcReaderLauncher = passportNfcReaderLauncher;
    }

    public final ActivityResultLauncher<PassportNfcReaderConfig> a() {
        return this.passportNfcReaderLauncher;
    }
}
