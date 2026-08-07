package lu;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.vending.licensing.util.Base64DecoderException;
import com.plaid.internal.EnumC4419g;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;

/* JADX INFO: loaded from: classes5.dex */
class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f90773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e f90774b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f90775c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f90776d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f90777e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final c f90778f;

    f(i iVar, c cVar, e eVar, int i11, String str, String str2) {
        this.f90773a = iVar;
        this.f90778f = cVar;
        this.f90774b = eVar;
        this.f90775c = i11;
        this.f90776d = str;
        this.f90777e = str2;
    }

    private void d(int i11) {
        this.f90774b.c(i11);
    }

    private void e() {
        this.f90774b.b(561);
    }

    private void f(int i11, k kVar) {
        this.f90773a.b(i11, kVar);
        if (this.f90773a.a()) {
            this.f90774b.a(i11);
        } else {
            this.f90774b.b(i11);
        }
    }

    public e a() {
        return this.f90774b;
    }

    public int b() {
        return this.f90775c;
    }

    public String c() {
        return this.f90776d;
    }

    public void g(PublicKey publicKey, int i11, String str, String str2) {
        k kVar;
        String str3;
        if (i11 == 0 || i11 == 1 || i11 == 2) {
            try {
                if (TextUtils.isEmpty(str)) {
                    Log.e("LicenseValidator", "Signature verification failed: signedData is empty. (Device not signed-in to any Google accounts?)");
                    e();
                    return;
                }
                Signature signature = Signature.getInstance("SHA1withRSA");
                signature.initVerify(publicKey);
                signature.update(str.getBytes());
                if (!signature.verify(mu.a.a(str2))) {
                    Log.e("LicenseValidator", "Signature verification failed.");
                    e();
                    return;
                }
                try {
                    k kVarA = k.a(str);
                    if (kVarA.f90782a != i11) {
                        Log.e("LicenseValidator", "Response codes don't match.");
                        e();
                        return;
                    }
                    if (kVarA.f90783b != this.f90775c) {
                        Log.e("LicenseValidator", "Nonce doesn't match.");
                        e();
                        return;
                    }
                    if (!kVarA.f90784c.equals(this.f90776d)) {
                        Log.e("LicenseValidator", "Package name doesn't match.");
                        e();
                        return;
                    } else {
                        if (!kVarA.f90785d.equals(this.f90777e)) {
                            Log.e("LicenseValidator", "Version codes don't match.");
                            e();
                            return;
                        }
                        String str4 = kVarA.f90786e;
                        if (TextUtils.isEmpty(str4)) {
                            Log.e("LicenseValidator", "User identifier is empty.");
                            e();
                            return;
                        } else {
                            kVar = kVarA;
                            str3 = str4;
                        }
                    }
                } catch (IllegalArgumentException unused) {
                    Log.e("LicenseValidator", "Could not parse response.");
                    e();
                    return;
                }
            } catch (Base64DecoderException unused2) {
                Log.e("LicenseValidator", "Could not Base64-decode signature.");
                e();
                return;
            } catch (InvalidKeyException unused3) {
                d(5);
                return;
            } catch (NoSuchAlgorithmException e11) {
                throw new RuntimeException(e11);
            } catch (SignatureException e12) {
                throw new RuntimeException(e12);
            }
        } else {
            str3 = null;
            kVar = null;
        }
        if (i11 != 0) {
            if (i11 == 1) {
                f(561, kVar);
                return;
            }
            if (i11 != 2) {
                if (i11 == 3) {
                    d(3);
                    return;
                }
                if (i11 == 4) {
                    Log.w("LicenseValidator", "An error has occurred on the licensing server.");
                    f(EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_CHECK_LOGO_NAVBAR_LIGHT_APPEARANCE_VALUE, kVar);
                    return;
                }
                if (i11 == 5) {
                    Log.w("LicenseValidator", "Licensing server is refusing to talk to this device, over quota.");
                    f(EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_CHECK_LOGO_NAVBAR_LIGHT_APPEARANCE_VALUE, kVar);
                    return;
                }
                switch (i11) {
                    case SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE:
                        Log.w("LicenseValidator", "Error contacting licensing server.");
                        f(EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_CHECK_LOGO_NAVBAR_LIGHT_APPEARANCE_VALUE, kVar);
                        return;
                    case SDK_ASSET_HEADER_BOLT_VALUE:
                        d(1);
                        return;
                    case SDK_ASSET_HEADER_FINAL_ENROLLMENT_SUCCESS_VALUE:
                        d(2);
                        return;
                    default:
                        Log.e("LicenseValidator", "Unknown response code for license check.");
                        e();
                        return;
                }
            }
        }
        f(this.f90778f.a(str3), kVar);
    }
}
