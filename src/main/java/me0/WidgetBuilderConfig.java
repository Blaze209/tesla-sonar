package me0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: me0.w, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0080\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\rJ\u001a\u0010\u0019\u001a\u00020\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u001b\u001a\u0004\b\u001c\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001d\u001a\u0004\b\u001e\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001f\u001a\u0004\b \u0010\u0011R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0012\u0010!\u001a\u0004\b\"\u0010\u0013¨\u0006#"}, d2 = {"Lme0/w;", "", "", "appWidgetId", "Lme0/a0;", "type", "", "withCache", "Lme0/b;", "commandExecution", "<init>", "(ILme0/a0;ZLme0/b;)V", "a", "()I", "b", "()Lme0/a0;", "c", "()Z", DateTokenConverter.CONVERTER_KEY, "()Lme0/b;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "I", "e", "Lme0/a0;", "getType", "Z", "getWithCache", "Lme0/b;", "getCommandExecution", "widget_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class WidgetBuilderConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int appWidgetId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final a0 type;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean withCache;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final b commandExecution;

    public WidgetBuilderConfig(int i11, a0 type, boolean z11, b commandExecution) {
        p013kotlin.jvm.internal.s.k(type, "type");
        p013kotlin.jvm.internal.s.k(commandExecution, "commandExecution");
        this.appWidgetId = i11;
        this.type = type;
        this.withCache = z11;
        this.commandExecution = commandExecution;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getAppWidgetId() {
        return this.appWidgetId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final a0 getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getWithCache() {
        return this.withCache;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final b getCommandExecution() {
        return this.commandExecution;
    }

    public final int e() {
        return this.appWidgetId;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WidgetBuilderConfig)) {
            return false;
        }
        WidgetBuilderConfig widgetBuilderConfig = (WidgetBuilderConfig) other;
        return this.appWidgetId == widgetBuilderConfig.appWidgetId && this.type == widgetBuilderConfig.type && this.withCache == widgetBuilderConfig.withCache && this.commandExecution == widgetBuilderConfig.commandExecution;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.appWidgetId) * 31) + this.type.hashCode()) * 31) + Boolean.hashCode(this.withCache)) * 31) + this.commandExecution.hashCode();
    }

    public String toString() {
        return "WidgetBuilderConfig(appWidgetId=" + this.appWidgetId + ", type=" + this.type + ", withCache=" + this.withCache + ", commandExecution=" + this.commandExecution + ")";
    }

    public /* synthetic */ WidgetBuilderConfig(int i11, a0 a0Var, boolean z11, b bVar, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, a0Var, (i12 & 4) != 0 ? false : z11, (i12 & 8) != 0 ? b.NONE : bVar);
    }
}
