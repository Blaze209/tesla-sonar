package com.swmansion.rnscreens.utils;

import ch.qos.logback.core.joran.action.Action;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import ezvcard.property.Gender;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0002\u0018\u0000 \u00122\u00020\u0001:\u0001\u0013B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/swmansion/rnscreens/utils/a;", "", "Lcom/swmansion/rnscreens/utils/b;", "cacheKey", "", "headerHeight", "<init>", "(Lcom/swmansion/rnscreens/utils/b;F)V", Action.KEY_ATTRIBUTE, "", "hasKey", "(Lcom/swmansion/rnscreens/utils/b;)Z", "Lcom/swmansion/rnscreens/utils/b;", "getCacheKey", "()Lcom/swmansion/rnscreens/utils/b;", Gender.FEMALE, "getHeaderHeight", "()F", "Companion", "a", "react-native-screens_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class a {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final a EMPTY = new a(new CacheKey(Integer.MIN_VALUE, false), BitmapDescriptorFactory.HUE_RED);
    private final CacheKey cacheKey;
    private final float headerHeight;

    /* JADX INFO: renamed from: com.swmansion.rnscreens.utils.a$a, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/swmansion/rnscreens/utils/a$a;", "", "<init>", "()V", "Lcom/swmansion/rnscreens/utils/a;", "EMPTY", "Lcom/swmansion/rnscreens/utils/a;", "getEMPTY", "()Lcom/swmansion/rnscreens/utils/a;", "react-native-screens_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a getEMPTY() {
            return a.EMPTY;
        }

        private Companion() {
        }
    }

    public a(CacheKey cacheKey, float f11) {
        s.k(cacheKey, "cacheKey");
        this.cacheKey = cacheKey;
        this.headerHeight = f11;
    }

    public final CacheKey getCacheKey() {
        return this.cacheKey;
    }

    public final float getHeaderHeight() {
        return this.headerHeight;
    }

    public final boolean hasKey(CacheKey key) {
        s.k(key, "key");
        return this.cacheKey.getFontSize() != Integer.MIN_VALUE && s.f(this.cacheKey, key);
    }
}
