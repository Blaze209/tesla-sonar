package com.fourthline.kyc.zipper;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.fourthline.core.ContextExtensionsKt;
import com.fourthline.core.internal.TimestampProviderInternal;
import com.fourthline.core.internal.identifiers.UserIdProvider;
import com.fourthline.kyc.KycInfo;
import com.fourthline.kyc.internal.c;
import com.fourthline.kyc.internal.g;
import com.fourthline.kyc.internal.l;
import com.fourthline.kyc.internal.m;
import com.fourthline.kyc.internal.n;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.net.URI;
import jn0.e;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import sn0.b;

/* JADX INFO: loaded from: classes4.dex */
@e
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/fourthline/kyc/zipper/Zipper;", "", "<init>", "()V", "Lcom/fourthline/kyc/KycInfo;", "kyc", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Ljava/net/URI;", "createZipFile", "(Lcom/fourthline/kyc/KycInfo;Landroid/content/Context;)Ljava/net/URI;", "Lcom/fourthline/kyc/internal/m;", "a", "Lcom/fourthline/kyc/internal/m;", "zipperAnalytics", "fourthline-kyc_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Zipper {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final m zipperAnalytics = new n();

    @e
    public final URI createZipFile(KycInfo kyc, Context context) throws ZipperError {
        s.k(kyc, "kyc");
        s.k(context, "context");
        this.zipperAnalytics.a();
        try {
            c cVar = new c(new g(new TimestampProviderInternal(), new UserIdProvider(context).getValue()));
            l lVar = new l(new File(ContextExtensionsKt.getFourthlineDirectory(context)));
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                cVar.a(kyc, byteArrayOutputStream);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                s.h(byteArray);
                URI uriA = l.a(lVar, byteArray, null, 2, null);
                this.zipperAnalytics.a(kyc, uriA);
                b.a(byteArrayOutputStream, null);
                return uriA;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    b.a(byteArrayOutputStream, th2);
                    throw th3;
                }
            }
        } catch (ZipperError e11) {
            this.zipperAnalytics.a(kyc, e11);
            throw e11;
        }
    }
}
