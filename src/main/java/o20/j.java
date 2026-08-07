package o20;

import android.app.Activity;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.t0;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b/\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0006\u0018\u0000 /2\u00020\u0001:\u0001:B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\nJ\u0017\u0010\u000e\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000e\u0010\nJ\u0017\u0010\u0010\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0010\u0010\nJ\u0017\u0010\u0012\u001a\u00020\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0012\u0010\nJ\u0017\u0010\u0014\u001a\u00020\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0014\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u001b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R$\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u001d\u0010\u0018\"\u0004\b\u001e\u0010\u001fR$\u0010#\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010\u0016\u001a\u0004\b!\u0010\u0018\"\u0004\b\"\u0010\u001fR$\u0010&\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0016\u001a\u0004\b$\u0010\u0018\"\u0004\b%\u0010\u001fR$\u0010)\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b'\u0010\u0018\"\u0004\b(\u0010\u001fR$\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0016\u001a\u0004\b*\u0010\u0018\"\u0004\b+\u0010\u001fR$\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0016\u001a\u0004\b,\u0010\u0018\"\u0004\b-\u0010\u001fR$\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010\u0016\u001a\u0004\b/\u0010\u0018\"\u0004\b0\u0010\u001fR$\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u0010\u0016\u001a\u0004\b.\u0010\u0018\"\u0004\b2\u0010\u001fR$\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010\u0016\u001a\u0004\b1\u0010\u0018\"\u0004\b3\u0010\u001fR\"\u00108\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u000105048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b6\u00107R\u0014\u00109\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0018¨\u0006;"}, d2 = {"Lo20/j;", "Lo20/c;", "", "name", "Ljava/util/UUID;", "screenId", "<init>", "(Ljava/lang/String;Ljava/util/UUID;)V", "type", "u", "(Ljava/lang/String;)Lo20/j;", "transitionType", "t", "fragmentClassName", "j", "fragmentTag", "k", "activityClassName", "h", "activityTag", IntegerTokenConverter.CONVERTER_KEY, DateTokenConverter.CONVERTER_KEY, "Ljava/lang/String;", "q", "()Ljava/lang/String;", "e", "p", "id", "f", "s", "setType", "(Ljava/lang/String;)V", "g", "getPreviousName", "setPreviousName", "previousName", "getPreviousId", "setPreviousId", "previousId", "getPreviousType", "setPreviousType", "previousType", "r", "setTransitionType", "n", "setFragmentClassName", "l", "o", "setFragmentTag", "m", "setActivityClassName", "setActivityTag", "", "", "b", "()Ljava/util/Map;", "dataPayload", "schema", "a", "snowplow-android-tracker_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class j extends c {

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final String f96328p = j.class.getSimpleName();

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final String name;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final String id;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private String type;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private String previousName;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private String previousId;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private String previousType;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private String transitionType;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private String fragmentClassName;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private String fragmentTag;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private String activityClassName;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private String activityTag;

    /* JADX INFO: renamed from: o20.j$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\u000b\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0011\u001a\n \u0010*\u0004\u0018\u00010\u00060\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lo20/j$a;", "", "<init>", "()V", "Landroid/app/Activity;", "activity", "", "b", "(Landroid/app/Activity;)Ljava/lang/String;", "s1", "s2", "c", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "Lo20/j;", "a", "(Landroid/app/Activity;)Lo20/j;", "kotlin.jvm.PlatformType", "TAG", "Ljava/lang/String;", "snowplow-android-tracker_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final String b(Activity activity) {
            Class<?> cls = activity.getClass();
            try {
                Object obj = cls.getField("snowplowScreenId").get(activity);
                if (obj instanceof String) {
                    return (String) obj;
                }
                String TAG = j.f96328p;
                s.j(TAG, "TAG");
                t0 t0Var = t0.f86535a;
                String str = String.format("The value of field `snowplowScreenId` on Activity `%s` has to be a String.", Arrays.copyOf(new Object[]{cls.getSimpleName()}, 1));
                s.j(str, "format(format, *args)");
                h20.g.b(TAG, str, new Object[0]);
                return null;
            } catch (NoSuchFieldException e11) {
                String TAG2 = j.f96328p;
                s.j(TAG2, "TAG");
                t0 t0Var2 = t0.f86535a;
                String str2 = String.format("Field `snowplowScreenId` not found on Activity `%s`.", Arrays.copyOf(new Object[]{cls.getSimpleName()}, 1));
                s.j(str2, "format(format, *args)");
                h20.g.a(TAG2, str2, e11);
                return null;
            } catch (Exception e12) {
                String TAG3 = j.f96328p;
                s.j(TAG3, "TAG");
                h20.g.b(TAG3, "Error retrieving value of field `snowplowScreenId`: " + e12.getMessage(), e12);
                return null;
            }
        }

        private final String c(String s11, String s12) {
            if (s11 == null || s11.length() <= 0) {
                return (s12 == null || s12.length() <= 0) ? "Unknown" : s12;
            }
            return s11;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final j a(Activity activity) {
            s.k(activity, "activity");
            String localClassName = activity.getLocalClassName();
            s.j(localClassName, "activity.localClassName");
            String strB = b(activity);
            return new j(c(localClassName, strB), null, 2, 0 == true ? 1 : 0).h(localClassName).i(strB).j(null).k(null).u(localClassName).t(null);
        }

        private Companion() {
        }
    }

    public /* synthetic */ j(String str, UUID uuid, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? null : uuid);
    }

    @Override // o20.f
    public Map<String, Object> b() {
        HashMap map = new HashMap();
        map.put("id", this.id);
        map.put("name", this.name);
        String str = this.type;
        if (str != null) {
            map.put("type", str);
        }
        String str2 = this.previousId;
        if (str2 != null) {
            map.put("previousId", str2);
        }
        String str3 = this.previousName;
        if (str3 != null) {
            map.put("previousName", str3);
        }
        String str4 = this.previousType;
        if (str4 != null) {
            map.put("previousType", str4);
        }
        String str5 = this.transitionType;
        if (str5 != null) {
            map.put("transitionType", str5);
        }
        return map;
    }

    @Override // o20.c
    /* JADX INFO: renamed from: f */
    public String getSchema() {
        return "iglu:com.snowplowanalytics.mobile/screen_view/jsonschema/1-0-0";
    }

    public final j h(String activityClassName) {
        this.activityClassName = activityClassName;
        return this;
    }

    public final j i(String activityTag) {
        this.activityTag = activityTag;
        return this;
    }

    public final j j(String fragmentClassName) {
        this.fragmentClassName = fragmentClassName;
        return this;
    }

    public final j k(String fragmentTag) {
        this.fragmentTag = fragmentTag;
        return this;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final String getActivityClassName() {
        return this.activityClassName;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final String getActivityTag() {
        return this.activityTag;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final String getFragmentClassName() {
        return this.fragmentClassName;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final String getFragmentTag() {
        return this.fragmentTag;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final String getTransitionType() {
        return this.transitionType;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final String getType() {
        return this.type;
    }

    public final j t(String transitionType) {
        this.transitionType = transitionType;
        return this;
    }

    public final j u(String type) {
        this.type = type;
        return this;
    }

    public j(String name, UUID uuid) {
        s.k(name, "name");
        if (name.length() <= 0) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name;
        String string = uuid != null ? uuid.toString() : null;
        this.id = string == null ? i20.c.r() : string;
    }
}
