package vf0;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.adyen.checkout.components.core.paymentmethod.CardPaymentMethod;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
final class u implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ b f119299a;

    u(b bVar) {
        this.f119299a = bVar;
    }

    @Override // vf0.h
    public final void a(String str, i iVar) {
        try {
            this.f119299a.f119267h = iVar;
            String strOptString = new JSONObject(str).optString(CardPaymentMethod.PAYMENT_METHOD_TYPE);
            if (TextUtils.isEmpty(strOptString)) {
                if (iVar != null) {
                    iVar.a(b.i("1", "Parameter error", null));
                    return;
                }
                return;
            }
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(strOptString));
            try {
                this.f119299a.startActivity(intent);
            } catch (Exception unused) {
                if (iVar != null) {
                    iVar.a(b.i("2", "Call application error", null));
                }
            }
        } catch (Exception e11) {
            if (iVar != null) {
                iVar.a(b.i("1", e11.getMessage(), null));
            }
        }
    }
}
