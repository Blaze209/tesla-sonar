package od0;

import android.util.Base64;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.common.internal.ImagesContract;
import com.tesla.notifications.attachment.AttachmentException;
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import java.util.UUID;
import jn0.t;
import org.json.JSONException;
import org.json.JSONObject;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: renamed from: od0.c, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0086\b\u0018\u0000 *2\u00020\u0001:\u0001\u0010BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001b\u001a\u0004\b \u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b\u001e\u0010\u0013R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b&\u0010%\u001a\u0004\b$\u0010\u0013R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b&\u0010)¨\u0006+"}, d2 = {"Lod0/c;", "", "", "iv", "tag", Action.KEY_ATTRIBUTE, "Ljava/util/UUID;", "uuid", "", "camera", "timestamp", "Ljava/net/URL;", ImagesContract.URL, "<init>", "([B[B[BLjava/util/UUID;Ljava/lang/String;Ljava/lang/String;Ljava/net/URL;)V", "Ldc0/b;", "a", "()Ldc0/b;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "[B", "c", "()[B", "b", DateTokenConverter.CONVERTER_KEY, "getKey", "Ljava/util/UUID;", "getUuid", "()Ljava/util/UUID;", "e", "Ljava/lang/String;", "f", "g", "Ljava/net/URL;", "()Ljava/net/URL;", "h", "notifications_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class EncryptedAttachment {

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final byte[] iv;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final byte[] tag;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final byte[] key;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final UUID uuid;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String camera;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String timestamp;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final URL url;

    /* JADX INFO: renamed from: od0.c$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lod0/c$a;", "", "<init>", "()V", "", "jsonString", "Lod0/c;", "a", "(Ljava/lang/String;)Lod0/c;", "notifications_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final EncryptedAttachment a(String jsonString) throws AttachmentException {
            Object objB;
            s.k(jsonString, "jsonString");
            try {
                JSONObject jSONObject = new JSONObject(jsonString);
                byte[] bArrDecode = Base64.decode(jSONObject.getString("iv"), 0);
                byte[] bArrDecode2 = Base64.decode(jSONObject.getString("tag"), 0);
                byte[] bArrDecode3 = Base64.decode(jSONObject.getString(Action.KEY_ATTRIBUTE), 0);
                UUID uuidFromString = UUID.fromString(jSONObject.getString("uuid"));
                String string = jSONObject.getString("camera");
                Locale locale = Locale.US;
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", locale);
                SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyyMMdd'T'HHmmss", locale);
                try {
                    jn0.s.Companion companion = jn0.s.INSTANCE;
                    Date date = simpleDateFormat.parse(jSONObject.getString("timestamp"));
                    if (date == null) {
                        date = new Date();
                    }
                    objB = jn0.s.b(date);
                } catch (Throwable th2) {
                    jn0.s.Companion companion2 = jn0.s.INSTANCE;
                    objB = jn0.s.b(t.a(th2));
                }
                Date date2 = new Date();
                if (jn0.s.g(objB)) {
                    objB = date2;
                }
                String str = simpleDateFormat2.format((Date) objB);
                URL url = new URL(jSONObject.getString(ImagesContract.URL));
                s.h(bArrDecode);
                s.h(bArrDecode2);
                s.h(bArrDecode3);
                s.h(uuidFromString);
                s.h(string);
                s.h(str);
                return new EncryptedAttachment(bArrDecode, bArrDecode2, bArrDecode3, uuidFromString, string, str, url);
            } catch (IllegalArgumentException e11) {
                throw new AttachmentException("Parsing error " + e11.getMessage());
            } catch (ParseException e12) {
                throw new AttachmentException("Invalid date-time format: " + e12.getMessage());
            } catch (JSONException e13) {
                throw new AttachmentException("Invalid JSON input: " + e13.getMessage());
            } catch (Exception e14) {
                throw new AttachmentException("Unknown error " + e14.getMessage());
            }
        }

        private Companion() {
        }
    }

    public EncryptedAttachment(byte[] iv2, byte[] tag, byte[] key, UUID uuid, String camera, String timestamp, URL url) {
        s.k(iv2, "iv");
        s.k(tag, "tag");
        s.k(key, "key");
        s.k(uuid, "uuid");
        s.k(camera, "camera");
        s.k(timestamp, "timestamp");
        s.k(url, "url");
        this.iv = iv2;
        this.tag = tag;
        this.key = key;
        this.uuid = uuid;
        this.camera = camera;
        this.timestamp = timestamp;
        this.url = url;
    }

    public final dc0.b a() {
        return dc0.b.f60442e.decode(this.key);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCamera() {
        return this.camera;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final byte[] getIv() {
        return this.iv;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final byte[] getTag() {
        return this.tag;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getTimestamp() {
        return this.timestamp;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EncryptedAttachment)) {
            return false;
        }
        EncryptedAttachment encryptedAttachment = (EncryptedAttachment) other;
        return s.f(this.iv, encryptedAttachment.iv) && s.f(this.tag, encryptedAttachment.tag) && s.f(this.key, encryptedAttachment.key) && s.f(this.uuid, encryptedAttachment.uuid) && s.f(this.camera, encryptedAttachment.camera) && s.f(this.timestamp, encryptedAttachment.timestamp) && s.f(this.url, encryptedAttachment.url);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final URL getUrl() {
        return this.url;
    }

    public int hashCode() {
        return (((((((((((Arrays.hashCode(this.iv) * 31) + Arrays.hashCode(this.tag)) * 31) + Arrays.hashCode(this.key)) * 31) + this.uuid.hashCode()) * 31) + this.camera.hashCode()) * 31) + this.timestamp.hashCode()) * 31) + this.url.hashCode();
    }

    public String toString() {
        return "EncryptedAttachment(iv=" + Arrays.toString(this.iv) + ", tag=" + Arrays.toString(this.tag) + ", key=" + Arrays.toString(this.key) + ", uuid=" + this.uuid + ", camera=" + this.camera + ", timestamp=" + this.timestamp + ", url=" + this.url + ")";
    }
}
