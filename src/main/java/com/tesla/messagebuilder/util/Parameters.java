package com.tesla.messagebuilder.util;

import androidx.annotation.Keep;
import com.squareup.moshi.g;
import com.squareup.moshi.i;
import ic0.m;
import ic0.n;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Keep
@i(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B\u001d\b\u0016\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ(\u0010\u000f\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0018\u001a\u00020\u00022\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\rR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001c\u0010\r¨\u0006\u001d"}, d2 = {"Lcom/tesla/messagebuilder/util/Parameters;", "", "", "enabled", "enterServiceModePlus", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "Lic0/m;", "remoteServiceAccessRequestPayload", "Lic0/n;", "serviceDiagnosticRequestPayload", "(Lic0/m;Lic0/n;)V", "component1", "()Ljava/lang/Boolean;", "component2", "copy", "(Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/tesla/messagebuilder/util/Parameters;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Boolean;", "getEnabled", "getEnterServiceModePlus", "message-builder_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class Parameters {
    private final Boolean enabled;
    private final Boolean enterServiceModePlus;

    public Parameters(@g(name = "allowed") Boolean bool, @g(name = "enter_service_mode_plus") Boolean bool2) {
        this.enabled = bool;
        this.enterServiceModePlus = bool2;
    }

    public static /* synthetic */ Parameters copy$default(Parameters parameters, Boolean bool, Boolean bool2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bool = parameters.enabled;
        }
        if ((i11 & 2) != 0) {
            bool2 = parameters.enterServiceModePlus;
        }
        return parameters.copy(bool, bool2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Boolean getEnabled() {
        return this.enabled;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Boolean getEnterServiceModePlus() {
        return this.enterServiceModePlus;
    }

    public final Parameters copy(@g(name = "allowed") Boolean enabled, @g(name = "enter_service_mode_plus") Boolean enterServiceModePlus) {
        return new Parameters(enabled, enterServiceModePlus);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Parameters)) {
            return false;
        }
        Parameters parameters = (Parameters) other;
        return s.f(this.enabled, parameters.enabled) && s.f(this.enterServiceModePlus, parameters.enterServiceModePlus);
    }

    public final Boolean getEnabled() {
        return this.enabled;
    }

    public final Boolean getEnterServiceModePlus() {
        return this.enterServiceModePlus;
    }

    public int hashCode() {
        Boolean bool = this.enabled;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.enterServiceModePlus;
        return iHashCode + (bool2 != null ? bool2.hashCode() : 0);
    }

    public String toString() {
        return "Parameters(enabled=" + this.enabled + ", enterServiceModePlus=" + this.enterServiceModePlus + ")";
    }

    public Parameters(m mVar, n nVar) {
        this(mVar != null ? Boolean.valueOf(mVar.getEnable()) : null, nVar != null ? Boolean.valueOf(nVar.getEnterServiceModePlus()) : null);
    }
}
