package ng0;

import android.content.Context;
import android.content.SharedPreferences;
import bo0.n;
import ch.qos.logback.core.CoreConstants;
import com.withpersona.sdk2.inquiry.featureflag.network.FeatureFlagResponse;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jn0.x;
import og0.FeatureFlagArguments;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.collections.v;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0013\u0010\u0014R\"\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\n0\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0017R\u001c\u0010\u001c\u001a\n \u001a*\u0004\u0018\u00010\u00190\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001bR \u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00030\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0017¨\u0006\u001e"}, d2 = {"Lng0/b;", "", "", "Lng0/a;", "defaultFeatureFlags", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Ljava/util/Set;Landroid/content/Context;)V", "featureFlag", "", "b", "(Lng0/a;)Z", "Lcom/withpersona/sdk2/inquiry/featureflag/network/FeatureFlagResponse;", "data", "Ljn0/h0;", "c", "(Lcom/withpersona/sdk2/inquiry/featureflag/network/FeatureFlagResponse;)V", "Log0/a;", "a", "()Log0/a;", "", "", "Ljava/util/Map;", "cache", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "Landroid/content/SharedPreferences;", "featureFlagPrefs", "defaultFeatureFlagMap", "feature-flag_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private volatile Map<String, Boolean> cache;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final SharedPreferences featureFlagPrefs;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Map<String, a> defaultFeatureFlagMap;

    public b(Set<a> defaultFeatureFlags, Context context) {
        s.k(defaultFeatureFlags, "defaultFeatureFlags");
        s.k(context, "context");
        this.cache = v0.i();
        this.featureFlagPrefs = context.getSharedPreferences("com.withpersona.sdk2.feature_flag_prefs", 0);
        Set<a> set = defaultFeatureFlags;
        LinkedHashMap linkedHashMap = new LinkedHashMap(n.f(v0.e(v.y(set, 10)), 16));
        for (Object obj : set) {
            linkedHashMap.put(((a) obj).getKey(), obj);
        }
        this.defaultFeatureFlagMap = linkedHashMap;
    }

    public final FeatureFlagArguments a() {
        return new FeatureFlagArguments(v.m1(this.defaultFeatureFlagMap.keySet()));
    }

    public final boolean b(a featureFlag) {
        s.k(featureFlag, "featureFlag");
        String string = this.featureFlagPrefs.getString(featureFlag.getKey(), "nil");
        if (!t.F(string, "nil")) {
            return s.f(string, "true");
        }
        Boolean bool = this.cache.get(featureFlag.getKey());
        if (bool != null) {
            return bool.booleanValue();
        }
        a aVar = this.defaultFeatureFlagMap.get(featureFlag.getKey());
        Boolean boolValueOf = aVar != null ? Boolean.valueOf(aVar.getDefaultValue()) : null;
        if (boolValueOf != null) {
            return boolValueOf.booleanValue();
        }
        return false;
    }

    public final void c(FeatureFlagResponse data) {
        if (data == null) {
            return;
        }
        List<FeatureFlagResponse.FeatureFlagDataResponse> listA = data.a();
        LinkedHashMap linkedHashMap = new LinkedHashMap(n.f(v0.e(v.y(listA, 10)), 16));
        for (FeatureFlagResponse.FeatureFlagDataResponse featureFlagDataResponse : listA) {
            Pair pairA = x.a(featureFlagDataResponse.getId(), Boolean.valueOf(featureFlagDataResponse.getEnabled()));
            linkedHashMap.put(pairA.e(), pairA.f());
        }
        this.cache = linkedHashMap;
    }
}
