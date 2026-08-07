package sw;

import android.util.Log;
import androidx.annotation.NonNull;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.internal.f;
import com.google.firebase.remoteconfig.internal.g;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    f f111902a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    f f111903b;

    a(f fVar, f fVar2) {
        this.f111902a = fVar;
        this.f111903b = fVar2;
    }

    @NonNull
    public static a a(@NonNull f fVar, @NonNull f fVar2) {
        return new a(fVar, fVar2);
    }

    @NonNull
    private String c(@NonNull String str) {
        String strD = d(this.f111902a, str);
        if (strD != null) {
            return strD;
        }
        String strD2 = d(this.f111903b, str);
        return strD2 != null ? strD2 : "";
    }

    private static String d(@NonNull f fVar, @NonNull String str) {
        g gVarF = fVar.f();
        if (gVarF == null) {
            return null;
        }
        try {
            return gVarF.g().getString(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    @NonNull
    uw.e b(@NonNull g gVar) throws FirebaseRemoteConfigClientException {
        JSONArray jSONArrayJ = gVar.j();
        long jK = gVar.k();
        HashSet hashSet = new HashSet();
        for (int i11 = 0; i11 < jSONArrayJ.length(); i11++) {
            try {
                JSONObject jSONObject = jSONArrayJ.getJSONObject(i11);
                String string = jSONObject.getString("rolloutId");
                JSONArray jSONArray = jSONObject.getJSONArray("affectedParameterKeys");
                if (jSONArray.length() > 1) {
                    Log.w("FirebaseRemoteConfig", String.format("Rollout has multiple affected parameter keys.Only the first key will be included in RolloutsState. rolloutId: %s, affectedParameterKeys: %s", string, jSONArray));
                }
                String strOptString = jSONArray.optString(0, "");
                hashSet.add(uw.d.a().d(string).f(jSONObject.getString("variantId")).b(strOptString).c(c(strOptString)).e(jK).a());
            } catch (JSONException e11) {
                throw new FirebaseRemoteConfigClientException("Exception parsing rollouts metadata to create RolloutsState.", e11);
            }
        }
        return uw.e.a(hashSet);
    }
}
