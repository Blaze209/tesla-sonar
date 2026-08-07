package e20;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import g20.f;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0007\u0018\u00002\u00020\u0001Bo\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\f\u0010\rJ%\u0010\u0010\u001a\u0004\u0018\u00010\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0018\u001a\u0004\b\u001d\u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0018\u001a\u0004\b\u001f\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u0018\u001a\u0004\b!\u0010\u001aR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u0018\u001a\u0004\b#\u0010\u001aR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0018\u001a\u0004\b\u0017\u0010\u001aR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u0018\u001a\u0004\b\u001b\u0010\u001aR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00008\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0013\u0010)\u001a\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b \u0010\u001aR\u0013\u0010*\u001a\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001aR\u0013\u0010+\u001a\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b\"\u0010\u001a¨\u0006,"}, d2 = {"Le20/a;", "Lg20/f;", "", "name", "type", "id", "transitionType", "fragmentClassName", "fragmentTag", "activityClassName", "activityTag", "previousScreenState", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Le20/a;)V", "s1", "s2", "g", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "", "debug", "Lr20/b;", "c", "(Z)Lr20/b;", "a", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "b", "getType", "getId", DateTokenConverter.CONVERTER_KEY, "getTransitionType", "e", "getFragmentClassName", "f", "getFragmentTag", "h", IntegerTokenConverter.CONVERTER_KEY, "Le20/a;", "getPreviousScreenState", "()Le20/a;", "previousName", "previousId", "previousType", "snowplow-android-tracker_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class a implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String name;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String type;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String id;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final String transitionType;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final String fragmentClassName;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final String fragmentTag;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final String activityClassName;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final String activityTag;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final a previousScreenState;

    public a() {
        this(null, null, null, null, null, null, null, null, null, 511, null);
    }

    private final String g(String s11, String s12) {
        if (s11 != null && s11.length() > 0) {
            return s11;
        }
        if (s12 == null || s12.length() <= 0) {
            return null;
        }
        return s12;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getActivityClassName() {
        return this.activityClassName;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getActivityTag() {
        return this.activityTag;
    }

    public final r20.b c(boolean debug) {
        r20.c cVar = new r20.c();
        cVar.d("id", this.id);
        cVar.d("name", this.name);
        cVar.d("type", this.type);
        if (debug) {
            cVar.d("fragment", g(this.fragmentClassName, this.fragmentTag));
            cVar.d("activity", g(this.activityClassName, this.activityTag));
        }
        return new r20.b("iglu:com.snowplowanalytics.mobile/screen/jsonschema/1-0-0", cVar);
    }

    public final String d() {
        a aVar = this.previousScreenState;
        if (aVar != null) {
            return aVar.id;
        }
        return null;
    }

    public final String e() {
        a aVar = this.previousScreenState;
        if (aVar != null) {
            return aVar.name;
        }
        return null;
    }

    public final String f() {
        a aVar = this.previousScreenState;
        if (aVar != null) {
            return aVar.type;
        }
        return null;
    }

    public a(String name, String str, String id2, String str2, String str3, String str4, String str5, String str6, a aVar) {
        s.k(name, "name");
        s.k(id2, "id");
        this.name = name;
        this.type = str;
        this.id = id2;
        this.transitionType = str2;
        this.fragmentClassName = str3;
        this.fragmentTag = str4;
        this.activityClassName = str5;
        this.activityTag = str6;
        this.previousScreenState = aVar;
    }

    public /* synthetic */ a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, a aVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "Unknown" : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? i20.c.r() : str3, (i11 & 8) != 0 ? null : str4, (i11 & 16) != 0 ? null : str5, (i11 & 32) != 0 ? null : str6, (i11 & 64) != 0 ? null : str7, (i11 & 128) != 0 ? null : str8, (i11 & 256) != 0 ? null : aVar);
    }
}
