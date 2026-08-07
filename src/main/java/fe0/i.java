package fe0;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.google.android.libraries.places.api.model.PlaceTypes;
import ezvcard.VCard;
import ezvcard.property.Address;
import ezvcard.property.Email;
import ezvcard.property.Telephone;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lfe0/i;", "", "<init>", "()V", "Landroid/content/Context;", "appContext", "Landroid/content/Intent;", AnalyticsAttribute.Intent, "Lorg/json/JSONObject;", "a", "(Landroid/content/Context;Landroid/content/Intent;)Lorg/json/JSONObject;", "share_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f65799a = new i();

    private i() {
    }

    public final JSONObject a(Context appContext, Intent intent) {
        Uri uri;
        s.k(appContext, "appContext");
        s.k(intent, "intent");
        try {
            ContentResolver contentResolver = appContext.getContentResolver();
            if (intent.getExtras() != null) {
                Bundle extras = intent.getExtras();
                s.h(extras);
                uri = (Uri) extras.get("android.intent.extra.STREAM");
            } else {
                uri = null;
            }
            if (uri != null) {
                InputStream inputStreamOpenInputStream = contentResolver.openInputStream(uri);
                VCard vCardC = xj0.a.a(inputStreamOpenInputStream).c();
                s.j(vCardC, "first(...)");
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("first_name", vCardC.m().getGiven());
                jSONObject.put("last_name", vCardC.m().getFamily());
                if (vCardC.i() != null) {
                    jSONObject.put("org_name", TextUtils.join(",", vCardC.i().getValues()));
                }
                List<Telephone> listN = vCardC.n();
                s.j(listN, "getTelephoneNumbers(...)");
                JSONArray jSONArray = new JSONArray();
                for (Telephone telephone : listN) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("type", TextUtils.join(",", telephone.getTypes()));
                    jSONObject2.put("phone_number", telephone.getText());
                    jSONArray.put(jSONObject2);
                }
                jSONObject.put("phone_numbers", jSONArray);
                List<Email> listF = vCardC.f();
                s.j(listF, "getEmails(...)");
                if (!listF.isEmpty()) {
                    JSONArray jSONArray2 = new JSONArray();
                    for (Email email : listF) {
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put("type", TextUtils.join(",", email.getTypes()));
                        jSONObject3.put("email_address", email.getValue());
                        jSONArray2.put(jSONObject3);
                    }
                    jSONObject.put("email_addresses", jSONArray2);
                }
                List<Address> listE = vCardC.e();
                s.j(listE, "getAddresses(...)");
                if (!listE.isEmpty()) {
                    JSONArray jSONArray3 = new JSONArray();
                    for (Address address : listE) {
                        JSONObject jSONObject4 = new JSONObject();
                        jSONObject4.put("type", TextUtils.join(",", address.getTypes()));
                        jSONObject4.put("address_string", address.getStreetAddress());
                        jSONObject4.put("city", address.getLocality());
                        jSONObject4.put(PlaceTypes.COUNTRY, address.getCountry());
                        jSONObject4.put(PlaceTypes.POSTAL_CODE, address.getPostalCode());
                        jSONObject4.put("state", address.getRegion());
                        jSONArray3.put(jSONObject4);
                    }
                    jSONObject.put("postal_addresses", jSONArray3);
                }
                s.h(inputStreamOpenInputStream);
                inputStreamOpenInputStream.close();
                return jSONObject;
            }
        } catch (IOException | NullPointerException | JSONException unused) {
        }
        return null;
    }
}
