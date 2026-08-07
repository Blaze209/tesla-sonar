package ue;

import com.adyen.checkout.cse.EncryptionException;
import j$.util.DesugarTimeZone;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\t\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lue/h;", "", "<init>", "()V", "Ljava/util/Date;", "generationTime", "", "", "entries", "a", "(Ljava/util/Date;Ljava/util/Map;)Ljava/lang/String;", "Ljava/text/SimpleDateFormat;", "b", "Ljava/text/SimpleDateFormat;", "GENERATION_DATE_FORMAT", "cse_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f116164a = new h();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final SimpleDateFormat GENERATION_DATE_FORMAT;

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        GENERATION_DATE_FORMAT = simpleDateFormat;
    }

    private h() {
    }

    public final String a(Date generationTime, Map<String, ? extends Object> entries) {
        s.k(generationTime, "generationTime");
        s.k(entries, "entries");
        try {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry<String, ? extends Object> entry : entries.entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
            jSONObject.put("generationtime", GENERATION_DATE_FORMAT.format(generationTime));
            String string = jSONObject.toString();
            s.h(string);
            return string;
        } catch (JSONException e11) {
            throw new EncryptionException("Encryption failed.", e11);
        }
    }
}
