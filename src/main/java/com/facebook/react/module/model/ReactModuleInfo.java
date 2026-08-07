package com.facebook.react.module.model;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import jn0.e;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0014\u0018\u0000 \u00172\u00020\u0001:\u0001\u000eB7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bBA\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028G¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00028G¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011R\u0017\u0010\u0006\u001a\u00020\u00058G¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u000e\u0010\u0015R\u0017\u0010\u0007\u001a\u00020\u00058G¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0017\u0010\u0015R\u0017\u0010\b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0016\u0010\u0015R\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0014\u001a\u0004\b\u0018\u0010\u0015¨\u0006\u0019"}, d2 = {"Lcom/facebook/react/module/model/ReactModuleInfo;", "", "", "name", "className", "", "canOverrideExistingModule", "needsEagerInit", "isCxxModule", "isTurboModule", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZZZZ)V", "hasConstants", "(Ljava/lang/String;Ljava/lang/String;ZZZZZ)V", "a", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "b", "c", "Z", "()Z", DateTokenConverter.CONVERTER_KEY, "g", "e", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ReactModuleInfo {

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String name;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String className;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean canOverrideExistingModule;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final boolean needsEagerInit;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final boolean isCxxModule;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final boolean isTurboModule;

    /* JADX INFO: renamed from: com.facebook.react.module.model.ReactModuleInfo$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u00020\u00062\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/facebook/react/module/model/ReactModuleInfo$a;", "", "<init>", "()V", "Ljava/lang/Class;", "clazz", "", "a", "(Ljava/lang/Class;)Z", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean a(Class<?> clazz) {
            s.k(clazz, "clazz");
            return TurboModule.class.isAssignableFrom(clazz);
        }

        private Companion() {
        }
    }

    public ReactModuleInfo(String name, String className, boolean z11, boolean z12, boolean z13, boolean z14) {
        s.k(name, "name");
        s.k(className, "className");
        this.name = name;
        this.className = className;
        this.canOverrideExistingModule = z11;
        this.needsEagerInit = z12;
        this.isCxxModule = z13;
        this.isTurboModule = z14;
    }

    public static final boolean b(Class<?> cls) {
        return INSTANCE.a(cls);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getCanOverrideExistingModule() {
        return this.canOverrideExistingModule;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getClassName() {
        return this.className;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getIsCxxModule() {
        return this.isCxxModule;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getIsTurboModule() {
        return this.isTurboModule;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getNeedsEagerInit() {
        return this.needsEagerInit;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @e
    public ReactModuleInfo(String name, String className, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        this(name, className, z11, z12, z14, z15);
        s.k(name, "name");
        s.k(className, "className");
    }
}
