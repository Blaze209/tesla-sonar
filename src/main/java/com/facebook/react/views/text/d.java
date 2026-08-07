package com.facebook.react.views.text;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@jn0.e
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u0012B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ-\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/facebook/react/views/text/d;", "", "Lkn/a;", "delegate", "<init>", "(Lkn/a;)V", "", "fontFamilyName", "", "style", "Landroid/content/res/AssetManager;", "assetManager", "Landroid/graphics/Typeface;", "e", "(Ljava/lang/String;ILandroid/content/res/AssetManager;)Landroid/graphics/Typeface;", "weight", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;IILandroid/content/res/AssetManager;)Landroid/graphics/Typeface;", "a", "Lkn/a;", "b", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static d f23685c;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final kn.a delegate;

    /* JADX INFO: renamed from: com.facebook.react.views.text.d$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/facebook/react/views/text/d$a;", "", "<init>", "()V", "Lcom/facebook/react/views/text/d;", "a", "()Lcom/facebook/react/views/text/d;", "instance", "Lcom/facebook/react/views/text/d;", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final d a() {
            d dVar = d.f23685c;
            if (dVar != null) {
                return dVar;
            }
            d dVar2 = new d(kn.a.INSTANCE.c(), null);
            d.f23685c = dVar2;
            return dVar2;
        }

        private Companion() {
        }
    }

    public /* synthetic */ d(kn.a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar);
    }

    public static final d c() {
        return INSTANCE.a();
    }

    public final Typeface d(String fontFamilyName, int style, int weight, AssetManager assetManager) {
        s.k(fontFamilyName, "fontFamilyName");
        s.k(assetManager, "assetManager");
        return this.delegate.d(fontFamilyName, style, weight, assetManager);
    }

    public final Typeface e(String fontFamilyName, int style, AssetManager assetManager) {
        s.k(fontFamilyName, "fontFamilyName");
        s.k(assetManager, "assetManager");
        return this.delegate.e(fontFamilyName, style, assetManager);
    }

    private d(kn.a aVar) {
        this.delegate = aVar;
    }
}
