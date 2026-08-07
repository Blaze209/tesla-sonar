package com.facebook.react.uimanager;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import ezvcard.property.Gender;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\u0018\u0000 \u001a2\u00020\u0001:\u0001\u0010B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\t\b\u0016¢\u0006\u0004\b\u0006\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\tJ \u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0086\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0014R\u0016\u0010\u0016\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0015R\u0016\u0010\u0019\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Lcom/facebook/react/uimanager/t0;", "", "", "defaultValue", "", "spacing", "<init>", "(F[F)V", "()V", "(F)V", "", "spacingType", "value", "", "c", "(IF)Z", "a", "(I)F", "b", Gender.FEMALE, "[F", "I", "valueFlags", DateTokenConverter.CONVERTER_KEY, "Z", "hasAliasesSet", "e", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class t0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int[] f23391f = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048};

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final float defaultValue;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final float[] spacing;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int valueFlags;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean hasAliasesSet;

    /* JADX INFO: renamed from: com.facebook.react.uimanager.t0$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u0015\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0014\u0010\f\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\tR\u0014\u0010\r\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\tR\u0014\u0010\u000e\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\tR\u0014\u0010\u000f\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\tR\u0014\u0010\u0010\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\tR\u0014\u0010\u0011\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\tR\u0014\u0010\u0012\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\tR\u0014\u0010\u0013\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\tR\u0014\u0010\u0014\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\tR\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/facebook/react/uimanager/t0$a;", "", "<init>", "()V", "", "b", "()[F", "", "LEFT", "I", "TOP", "RIGHT", "BOTTOM", "START", "END", "HORIZONTAL", "VERTICAL", "ALL", "BLOCK", "BLOCK_END", "BLOCK_START", "", "flagsMap", "[I", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final float[] b() {
            return new float[]{Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN};
        }

        private Companion() {
        }
    }

    public t0(float f11, float[] spacing) {
        p013kotlin.jvm.internal.s.k(spacing, "spacing");
        this.defaultValue = f11;
        this.spacing = spacing;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x000c  */
    public final float a(int spacingType) {
        float f11;
        if (spacingType != 4 && spacingType != 5) {
            switch (spacingType) {
                case 9:
                case 10:
                case 11:
                    f11 = Float.NaN;
                    break;
                default:
                    f11 = this.defaultValue;
                    break;
            }
        } else {
            f11 = Float.NaN;
        }
        int i11 = this.valueFlags;
        if (i11 != 0) {
            int[] iArr = f23391f;
            if ((iArr[spacingType] & i11) != 0) {
                return this.spacing[spacingType];
            }
            if (this.hasAliasesSet) {
                char c11 = (spacingType == 1 || spacingType == 3) ? (char) 7 : (char) 6;
                if ((iArr[c11] & i11) != 0) {
                    return this.spacing[c11];
                }
                if ((i11 & iArr[8]) != 0) {
                    return this.spacing[8];
                }
            }
        }
        return f11;
    }

    public final float b(int spacingType) {
        return this.spacing[spacingType];
    }

    public final boolean c(int spacingType, float value) {
        int i11;
        if (f.a(this.spacing[spacingType], value)) {
            return false;
        }
        this.spacing[spacingType] = value;
        if (com.facebook.yoga.g.a(value)) {
            i11 = (~f23391f[spacingType]) & this.valueFlags;
        } else {
            i11 = f23391f[spacingType] | this.valueFlags;
        }
        this.valueFlags = i11;
        int[] iArr = f23391f;
        this.hasAliasesSet = ((iArr[8] & i11) == 0 && (iArr[7] & i11) == 0 && (iArr[6] & i11) == 0 && (i11 & iArr[9]) == 0) ? false : true;
        return true;
    }

    public t0() {
        this(BitmapDescriptorFactory.HUE_RED, INSTANCE.b());
    }

    public t0(float f11) {
        this(f11, INSTANCE.b());
    }
}
