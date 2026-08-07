package com.google.android.play.core.integrity;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import java.util.Locale;

/* JADX INFO: loaded from: classes5.dex */
public class StandardIntegrityException extends ApiException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Throwable f43127a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f43128b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f43129c;

    StandardIntegrityException(int i11, boolean z11, Throwable th2) {
        super(new Status(i11, String.format(Locale.ROOT, "Standard Integrity API error (%d): %s.", Integer.valueOf(i11), au.a.a(i11))));
        this.f43129c = new Object();
        if (i11 == 0) {
            throw new IllegalArgumentException("ErrorCode should not be 0.");
        }
        this.f43127a = th2;
        this.f43128b = z11;
    }

    public int a() {
        return super.getStatusCode();
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable getCause() {
        return this.f43127a;
    }
}
