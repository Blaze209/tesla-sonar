package com.tesla.features;

import androidx.annotation.Keep;
import com.squareup.moshi.g;
import com.squareup.moshi.i;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Keep
@i(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/tesla/features/FeaturesConfigEnvelope;", "", "config", "Lcom/tesla/features/FeaturesConfig;", "<init>", "(Lcom/tesla/features/FeaturesConfig;)V", "getConfig", "()Lcom/tesla/features/FeaturesConfig;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "features_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class FeaturesConfigEnvelope {

    @g(name = "response")
    private final FeaturesConfig config;

    public FeaturesConfigEnvelope(FeaturesConfig config) {
        s.k(config, "config");
        this.config = config;
    }

    public static /* synthetic */ FeaturesConfigEnvelope copy$default(FeaturesConfigEnvelope featuresConfigEnvelope, FeaturesConfig featuresConfig, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            featuresConfig = featuresConfigEnvelope.config;
        }
        return featuresConfigEnvelope.copy(featuresConfig);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final FeaturesConfig getConfig() {
        return this.config;
    }

    public final FeaturesConfigEnvelope copy(FeaturesConfig config) {
        s.k(config, "config");
        return new FeaturesConfigEnvelope(config);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof FeaturesConfigEnvelope) && s.f(this.config, ((FeaturesConfigEnvelope) other).config);
    }

    public final FeaturesConfig getConfig() {
        return this.config;
    }

    public int hashCode() {
        return this.config.hashCode();
    }

    public String toString() {
        return "FeaturesConfigEnvelope(config=" + this.config + ")";
    }
}
