package oi0;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.LocalImage;
import com.withpersona.sdk2.inquiry.shared.ui.ThemeableLottieAnimationView;
import ezvcard.property.Gender;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a#\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001aQ\u0010\u0010\u001a\u00020\u000f*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\n\u001a\u00020\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Loi0/k2;", "Loi0/p5;", "uiComponentHelper", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/LocalImage;", "config", "Landroid/view/View;", Gender.OTHER, "(Loi0/k2;Loi0/p5;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/LocalImage;)Landroid/view/View;", "", "lottieRes", "drawableRes", "", "", "originalStrokeColors", "originalFillColors", "Lgb/a;", "L", "(Loi0/k2;Loi0/p5;II[Ljava/lang/String;[Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/LocalImage;)Lgb/a;", "ui-step-renderer_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class w3 {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f97801a;

        static {
            int[] iArr = new int[LocalImage.Image.values().length];
            try {
                iArr[LocalImage.Image.START_HERO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LocalImage.Image.DOCUMENT_START_HERO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LocalImage.Image.ANIMATED_CHECK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LocalImage.Image.FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[LocalImage.Image.ID_FRONT_FAILED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[LocalImage.Image.ID_BACK_FAILED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[LocalImage.Image.SELFIE_FAILED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[LocalImage.Image.DOCUMENT_FAILED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[LocalImage.Image.PASSPORT_NFC_START_HERO.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[LocalImage.Image.PASSPORT_NFC_SCAN_HERO.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[LocalImage.Image.PASSPORT_NFC_SCAN_READY_HERO.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[LocalImage.Image.PASSPORT_NFC_CHECK.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[LocalImage.Image.GOVERNMENT_ID_NFC_SCAN_BACK_CLOSED.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[LocalImage.Image.GOVERNMENT_ID_NFC_SCAN_FRONT_CLOSED.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[LocalImage.Image.GOVERNMENT_ID_NFC_SCAN_PHOTO_PAGE.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[LocalImage.Image.GOVERNMENT_ID_NFC_SCAN_ID_CARD.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[LocalImage.Image.GOVERNMENT_ID_NFC_SCAN_BACK_THEN_FRONT.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[LocalImage.Image.CREATE_PERSONA_CTA_CARD_ICON.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[LocalImage.Image.OPTION_CHECK_ICON.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[LocalImage.Image.OPTION_CHEVRON_ICON.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[LocalImage.Image.OPTION_FLAG_ICON.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[LocalImage.Image.OPTION_GLOBE_ICON.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[LocalImage.Image.OPTION_HOME_ICON.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[LocalImage.Image.OPTION_ID_DOCUMENT_ICON.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[LocalImage.Image.OPTION_ID_ICON.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[LocalImage.Image.OPTION_PHONE_ICON.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[LocalImage.Image.OPTION_USER_ICON.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[LocalImage.Image.REUSABLE_PERSONA_LOGO.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            f97801a = iArr;
        }
    }

    public static final gb.a L(LocalImageComponent localImageComponent, p5 uiComponentHelper, int i11, int i12, final String[] originalStrokeColors, final String[] originalFillColors, final LocalImage config) {
        p013kotlin.jvm.internal.s.k(localImageComponent, "<this>");
        p013kotlin.jvm.internal.s.k(uiComponentHelper, "uiComponentHelper");
        p013kotlin.jvm.internal.s.k(originalStrokeColors, "originalStrokeColors");
        p013kotlin.jvm.internal.s.k(originalFillColors, "originalFillColors");
        p013kotlin.jvm.internal.s.k(config, "config");
        if (config.getStyles() != null) {
            final bi0.e eVarC = bi0.e.c(uiComponentHelper.getLayoutInflater());
            eVarC.f17431b.setAnimation(i11);
            uiComponentHelper.d(new wn0.a() { // from class: oi0.n3
                @Override // wn0.a
                public final Object invoke() {
                    return w3.M(eVarC, config, originalStrokeColors, originalFillColors);
                }
            });
            p013kotlin.jvm.internal.s.h(eVarC);
            return eVarC;
        }
        final int dimension = (int) uiComponentHelper.getCh.qos.logback.core.CoreConstants.CONTEXT_SCOPE_VALUE java.lang.String().getResources().getDimension(qh0.c.f105543e);
        final bi0.f fVarC = bi0.f.c(uiComponentHelper.getLayoutInflater());
        fVarC.f17433b.setImageResource(i12);
        uiComponentHelper.d(new wn0.a() { // from class: oi0.o3
            @Override // wn0.a
            public final Object invoke() {
                return w3.N(fVarC, dimension);
            }
        });
        p013kotlin.jvm.internal.s.h(fVarC);
        return fVarC;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 M(bi0.e eVar, LocalImage localImage, String[] strArr, String[] strArr2) {
        ThemeableLottieAnimationView lottieView = eVar.f17431b;
        p013kotlin.jvm.internal.s.j(lottieView, "lottieView");
        ui0.g.c(lottieView, localImage.getStyles(), strArr, strArr2, new String[0]);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 N(bi0.f fVar, int i11) {
        ImageView imageView = fVar.f17433b;
        p013kotlin.jvm.internal.s.j(imageView, "imageView");
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = i11;
        imageView.setLayoutParams(layoutParams);
        return jn0.h0.f84049a;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x069c  */
    /* JADX WARN: Code duplicated, block: B:106:0x06a1 A[RETURN] */
    public static final View O(LocalImageComponent localImageComponent, p5 uiComponentHelper, final LocalImage config) {
        gb.a aVarL;
        final bi0.f fVarC;
        final bi0.e eVarC;
        final bi0.e eVarC2;
        final bi0.f fVarC2;
        final bi0.e eVarC3;
        final bi0.f fVarC3;
        final bi0.e eVarC4;
        final bi0.f fVarC4;
        final bi0.e eVarC5;
        final bi0.f fVarC5;
        final bi0.e eVarC6;
        final bi0.e eVarC7;
        final bi0.e eVarC8;
        final bi0.e eVarC9;
        final bi0.e eVarC10;
        bi0.e eVarC11;
        p013kotlin.jvm.internal.s.k(localImageComponent, "<this>");
        p013kotlin.jvm.internal.s.k(uiComponentHelper, "uiComponentHelper");
        p013kotlin.jvm.internal.s.k(config, "config");
        Context context = uiComponentHelper.getCh.qos.logback.core.CoreConstants.CONTEXT_SCOPE_VALUE java.lang.String();
        final int dimension = (int) context.getResources().getDimension(qh0.c.f105539a);
        final int dimension2 = (int) context.getResources().getDimension(qh0.c.f105542d);
        LocalImage.Attributes attributes = config.getAttributes();
        LocalImage.Image imageKey = attributes != null ? attributes.getImageKey() : null;
        switch (imageKey == null ? -1 : a.f97801a[imageKey.ordinal()]) {
            case -1:
                aVarL = null;
                if (aVarL != null) {
                    aVarL = eVarC;
                    aVarL = eVarC2;
                    aVarL = fVarC2;
                    aVarL = eVarC3;
                    aVarL = fVarC3;
                    aVarL = eVarC4;
                    aVarL = fVarC4;
                    aVarL = eVarC5;
                    aVarL = fVarC5;
                    aVarL = eVarC6;
                    aVarL = eVarC7;
                    aVarL = eVarC8;
                    aVarL = eVarC9;
                    aVarL = eVarC9;
                    aVarL = eVarC10;
                    aVarL = eVarC10;
                    aVarL = eVarC11;
                    return aVarL.getRoot();
                }
                aVarL = eVarC;
                aVarL = eVarC2;
                aVarL = fVarC2;
                aVarL = eVarC3;
                aVarL = fVarC3;
                aVarL = eVarC4;
                aVarL = fVarC4;
                aVarL = eVarC5;
                aVarL = fVarC5;
                aVarL = eVarC6;
                aVarL = eVarC7;
                aVarL = eVarC8;
                aVarL = eVarC9;
                aVarL = eVarC9;
                aVarL = eVarC10;
                aVarL = eVarC10;
                aVarL = eVarC11;
                return null;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                if (config.getStyles() != null) {
                    eVarC = bi0.e.c(uiComponentHelper.getLayoutInflater());
                    eVarC.f17431b.setAnimation(yh0.o.f125564k);
                    uiComponentHelper.d(new wn0.a() { // from class: oi0.l2
                        @Override // wn0.a
                        public final Object invoke() {
                            return w3.P(eVarC, config);
                        }
                    });
                    p013kotlin.jvm.internal.s.h(eVarC);
                } else {
                    fVarC = bi0.f.c(uiComponentHelper.getLayoutInflater());
                    fVarC.f17433b.setImageResource(yh0.l.f125529p);
                    uiComponentHelper.d(new wn0.a() { // from class: oi0.n2
                        @Override // wn0.a
                        public final Object invoke() {
                            return w3.c0(fVarC, dimension);
                        }
                    });
                    p013kotlin.jvm.internal.s.h(fVarC);
                    aVarL = fVarC;
                }
                if (aVarL != null) {
                    aVarL = eVarC;
                    aVarL = eVarC2;
                    aVarL = fVarC2;
                    aVarL = eVarC3;
                    aVarL = fVarC3;
                    aVarL = eVarC4;
                    aVarL = fVarC4;
                    aVarL = eVarC5;
                    aVarL = fVarC5;
                    aVarL = eVarC6;
                    aVarL = eVarC7;
                    aVarL = eVarC8;
                    aVarL = eVarC9;
                    aVarL = eVarC9;
                    aVarL = eVarC10;
                    aVarL = eVarC10;
                    aVarL = eVarC11;
                    return aVarL.getRoot();
                }
                aVarL = eVarC;
                aVarL = eVarC2;
                aVarL = fVarC2;
                aVarL = eVarC3;
                aVarL = fVarC3;
                aVarL = eVarC4;
                aVarL = fVarC4;
                aVarL = eVarC5;
                aVarL = fVarC5;
                aVarL = eVarC6;
                aVarL = eVarC7;
                aVarL = eVarC8;
                aVarL = eVarC9;
                aVarL = eVarC9;
                aVarL = eVarC10;
                aVarL = eVarC10;
                aVarL = eVarC11;
                return null;
            case 2:
                if (config.getStyles() != null) {
                    eVarC2 = bi0.e.c(uiComponentHelper.getLayoutInflater());
                    eVarC2.f17431b.setAnimation(yh0.o.f125555b);
                    uiComponentHelper.d(new wn0.a() { // from class: oi0.z2
                        @Override // wn0.a
                        public final Object invoke() {
                            return w3.n0(eVarC2, config);
                        }
                    });
                    p013kotlin.jvm.internal.s.h(eVarC2);
                } else {
                    fVarC = bi0.f.c(uiComponentHelper.getLayoutInflater());
                    fVarC.f17433b.setImageResource(yh0.l.f125524k);
                    uiComponentHelper.d(new wn0.a() { // from class: oi0.f3
                        @Override // wn0.a
                        public final Object invoke() {
                            return w3.x0(fVarC, dimension);
                        }
                    });
                    p013kotlin.jvm.internal.s.h(fVarC);
                    aVarL = fVarC;
                }
                if (aVarL != null) {
                    aVarL = eVarC;
                    aVarL = eVarC2;
                    aVarL = fVarC2;
                    aVarL = eVarC3;
                    aVarL = fVarC3;
                    aVarL = eVarC4;
                    aVarL = fVarC4;
                    aVarL = eVarC5;
                    aVarL = fVarC5;
                    aVarL = eVarC6;
                    aVarL = eVarC7;
                    aVarL = eVarC8;
                    aVarL = eVarC9;
                    aVarL = eVarC9;
                    aVarL = eVarC10;
                    aVarL = eVarC10;
                    aVarL = eVarC11;
                    return aVarL.getRoot();
                }
                aVarL = eVarC;
                aVarL = eVarC2;
                aVarL = fVarC2;
                aVarL = eVarC3;
                aVarL = fVarC3;
                aVarL = eVarC4;
                aVarL = fVarC4;
                aVarL = eVarC5;
                aVarL = fVarC5;
                aVarL = eVarC6;
                aVarL = eVarC7;
                aVarL = eVarC8;
                aVarL = eVarC9;
                aVarL = eVarC9;
                aVarL = eVarC10;
                aVarL = eVarC10;
                aVarL = eVarC11;
                return null;
            case 3:
                final bi0.e eVarC12 = bi0.e.c(uiComponentHelper.getLayoutInflater());
                eVarC12.f17431b.setAnimation(yh0.o.f125565l);
                uiComponentHelper.d(new wn0.a() { // from class: oi0.g3
                    @Override // wn0.a
                    public final Object invoke() {
                        return w3.Q(eVarC12);
                    }
                });
                eVarC12.f17431b.j(new tf.c0() { // from class: oi0.i3
                    @Override // tf.c0
                    public final void a(tf.i iVar) {
                        w3.R(eVarC12, iVar);
                    }
                });
                aVarL = eVarC12;
                if (aVarL != null) {
                    aVarL = eVarC;
                    aVarL = eVarC2;
                    aVarL = fVarC2;
                    aVarL = eVarC3;
                    aVarL = fVarC3;
                    aVarL = eVarC4;
                    aVarL = fVarC4;
                    aVarL = eVarC5;
                    aVarL = fVarC5;
                    aVarL = eVarC6;
                    aVarL = eVarC7;
                    aVarL = eVarC8;
                    aVarL = eVarC9;
                    aVarL = eVarC9;
                    aVarL = eVarC10;
                    aVarL = eVarC10;
                    aVarL = eVarC11;
                    return aVarL.getRoot();
                }
                aVarL = eVarC;
                aVarL = eVarC2;
                aVarL = fVarC2;
                aVarL = eVarC3;
                aVarL = fVarC3;
                aVarL = eVarC4;
                aVarL = fVarC4;
                aVarL = eVarC5;
                aVarL = fVarC5;
                aVarL = eVarC6;
                aVarL = eVarC7;
                aVarL = eVarC8;
                aVarL = eVarC9;
                aVarL = eVarC9;
                aVarL = eVarC10;
                aVarL = eVarC10;
                aVarL = eVarC11;
                return null;
            case 4:
                if (config.getStyles() != null) {
                    eVarC3 = bi0.e.c(uiComponentHelper.getLayoutInflater());
                    eVarC3.f17431b.setAnimation(yh0.o.f125563j);
                    uiComponentHelper.d(new wn0.a() { // from class: oi0.j3
                        @Override // wn0.a
                        public final Object invoke() {
                            return w3.S(eVarC3, config);
                        }
                    });
                    p013kotlin.jvm.internal.s.h(eVarC3);
                } else {
                    fVarC2 = bi0.f.c(uiComponentHelper.getLayoutInflater());
                    fVarC2.f17433b.setImageResource(yh0.l.f125528o);
                    uiComponentHelper.d(new wn0.a() { // from class: oi0.k3
                        @Override // wn0.a
                        public final Object invoke() {
                            return w3.T(fVarC2, dimension2);
                        }
                    });
                    p013kotlin.jvm.internal.s.h(fVarC2);
                }
                if (aVarL != null) {
                    aVarL = eVarC;
                    aVarL = eVarC2;
                    aVarL = fVarC2;
                    aVarL = eVarC3;
                    aVarL = fVarC3;
                    aVarL = eVarC4;
                    aVarL = fVarC4;
                    aVarL = eVarC5;
                    aVarL = fVarC5;
                    aVarL = eVarC6;
                    aVarL = eVarC7;
                    aVarL = eVarC8;
                    aVarL = eVarC9;
                    aVarL = eVarC9;
                    aVarL = eVarC10;
                    aVarL = eVarC10;
                    aVarL = eVarC11;
                    return aVarL.getRoot();
                }
                aVarL = eVarC;
                aVarL = eVarC2;
                aVarL = fVarC2;
                aVarL = eVarC3;
                aVarL = fVarC3;
                aVarL = eVarC4;
                aVarL = fVarC4;
                aVarL = eVarC5;
                aVarL = fVarC5;
                aVarL = eVarC6;
                aVarL = eVarC7;
                aVarL = eVarC8;
                aVarL = eVarC9;
                aVarL = eVarC9;
                aVarL = eVarC10;
                aVarL = eVarC10;
                aVarL = eVarC11;
                return null;
            case 5:
                if (config.getStyles() != null) {
                    eVarC4 = bi0.e.c(uiComponentHelper.getLayoutInflater());
                    eVarC4.f17431b.setAnimation(yh0.o.f125562i);
                    uiComponentHelper.d(new wn0.a() { // from class: oi0.l3
                        @Override // wn0.a
                        public final Object invoke() {
                            return w3.U(eVarC4, config);
                        }
                    });
                    p013kotlin.jvm.internal.s.h(eVarC4);
                } else {
                    fVarC3 = bi0.f.c(uiComponentHelper.getLayoutInflater());
                    fVarC3.f17433b.setImageResource(yh0.l.f125527n);
                    uiComponentHelper.d(new wn0.a() { // from class: oi0.m3
                        @Override // wn0.a
                        public final Object invoke() {
                            return w3.V(fVarC3, dimension2);
                        }
                    });
                    p013kotlin.jvm.internal.s.h(fVarC3);
                }
                if (aVarL != null) {
                    aVarL = eVarC;
                    aVarL = eVarC2;
                    aVarL = fVarC2;
                    aVarL = eVarC3;
                    aVarL = fVarC3;
                    aVarL = eVarC4;
                    aVarL = fVarC4;
                    aVarL = eVarC5;
                    aVarL = fVarC5;
                    aVarL = eVarC6;
                    aVarL = eVarC7;
                    aVarL = eVarC8;
                    aVarL = eVarC9;
                    aVarL = eVarC9;
                    aVarL = eVarC10;
                    aVarL = eVarC10;
                    aVarL = eVarC11;
                    return aVarL.getRoot();
                }
                aVarL = eVarC;
                aVarL = eVarC2;
                aVarL = fVarC2;
                aVarL = eVarC3;
                aVarL = fVarC3;
                aVarL = eVarC4;
                aVarL = fVarC4;
                aVarL = eVarC5;
                aVarL = fVarC5;
                aVarL = eVarC6;
                aVarL = eVarC7;
                aVarL = eVarC8;
                aVarL = eVarC9;
                aVarL = eVarC9;
                aVarL = eVarC10;
                aVarL = eVarC10;
                aVarL = eVarC11;
                return null;
            case 6:
                if (config.getStyles() != null) {
                    eVarC5 = bi0.e.c(uiComponentHelper.getLayoutInflater());
                    eVarC5.f17431b.setAnimation(yh0.o.f125561h);
                    uiComponentHelper.d(new wn0.a() { // from class: oi0.w2
                        @Override // wn0.a
                        public final Object invoke() {
                            return w3.W(eVarC5, config);
                        }
                    });
                    p013kotlin.jvm.internal.s.h(eVarC5);
                } else {
                    fVarC4 = bi0.f.c(uiComponentHelper.getLayoutInflater());
                    fVarC4.f17433b.setImageResource(yh0.l.f125526m);
                    uiComponentHelper.d(new wn0.a() { // from class: oi0.h3
                        @Override // wn0.a
                        public final Object invoke() {
                            return w3.X(fVarC4, dimension2);
                        }
                    });
                    p013kotlin.jvm.internal.s.h(fVarC4);
                }
                if (aVarL != null) {
                    aVarL = eVarC;
                    aVarL = eVarC2;
                    aVarL = fVarC2;
                    aVarL = eVarC3;
                    aVarL = fVarC3;
                    aVarL = eVarC4;
                    aVarL = fVarC4;
                    aVarL = eVarC5;
                    aVarL = fVarC5;
                    aVarL = eVarC6;
                    aVarL = eVarC7;
                    aVarL = eVarC8;
                    aVarL = eVarC9;
                    aVarL = eVarC9;
                    aVarL = eVarC10;
                    aVarL = eVarC10;
                    aVarL = eVarC11;
                    return aVarL.getRoot();
                }
                aVarL = eVarC;
                aVarL = eVarC2;
                aVarL = fVarC2;
                aVarL = eVarC3;
                aVarL = fVarC3;
                aVarL = eVarC4;
                aVarL = fVarC4;
                aVarL = eVarC5;
                aVarL = fVarC5;
                aVarL = eVarC6;
                aVarL = eVarC7;
                aVarL = eVarC8;
                aVarL = eVarC9;
                aVarL = eVarC9;
                aVarL = eVarC10;
                aVarL = eVarC10;
                aVarL = eVarC11;
                return null;
            case 7:
                if (config.getStyles() != null) {
                    eVarC6 = bi0.e.c(uiComponentHelper.getLayoutInflater());
                    eVarC6.f17431b.setAnimation(yh0.o.f125579z);
                    uiComponentHelper.d(new wn0.a() { // from class: oi0.p3
                        @Override // wn0.a
                        public final Object invoke() {
                            return w3.Y(eVarC6, config);
                        }
                    });
                    p013kotlin.jvm.internal.s.h(eVarC6);
                } else {
                    fVarC5 = bi0.f.c(uiComponentHelper.getLayoutInflater());
                    fVarC5.f17433b.setImageResource(yh0.l.f125531r);
                    uiComponentHelper.d(new wn0.a() { // from class: oi0.q3
                        @Override // wn0.a
                        public final Object invoke() {
                            return w3.Z(fVarC5, dimension2);
                        }
                    });
                    p013kotlin.jvm.internal.s.h(fVarC5);
                }
                if (aVarL != null) {
                    aVarL = eVarC;
                    aVarL = eVarC2;
                    aVarL = fVarC2;
                    aVarL = eVarC3;
                    aVarL = fVarC3;
                    aVarL = eVarC4;
                    aVarL = fVarC4;
                    aVarL = eVarC5;
                    aVarL = fVarC5;
                    aVarL = eVarC6;
                    aVarL = eVarC7;
                    aVarL = eVarC8;
                    aVarL = eVarC9;
                    aVarL = eVarC9;
                    aVarL = eVarC10;
                    aVarL = eVarC10;
                    aVarL = eVarC11;
                    return aVarL.getRoot();
                }
                aVarL = eVarC;
                aVarL = eVarC2;
                aVarL = fVarC2;
                aVarL = eVarC3;
                aVarL = fVarC3;
                aVarL = eVarC4;
                aVarL = fVarC4;
                aVarL = eVarC5;
                aVarL = fVarC5;
                aVarL = eVarC6;
                aVarL = eVarC7;
                aVarL = eVarC8;
                aVarL = eVarC9;
                aVarL = eVarC9;
                aVarL = eVarC10;
                aVarL = eVarC10;
                aVarL = eVarC11;
                return null;
            case 8:
                if (config.getStyles() != null) {
                    eVarC7 = bi0.e.c(uiComponentHelper.getLayoutInflater());
                    eVarC7.f17431b.setAnimation(yh0.o.f125554a);
                    uiComponentHelper.d(new wn0.a() { // from class: oi0.r3
                        @Override // wn0.a
                        public final Object invoke() {
                            return w3.a0(eVarC7, config);
                        }
                    });
                    p013kotlin.jvm.internal.s.h(eVarC7);
                } else {
                    fVarC = bi0.f.c(uiComponentHelper.getLayoutInflater());
                    fVarC.f17433b.setImageResource(yh0.l.f125523j);
                    uiComponentHelper.d(new wn0.a() { // from class: oi0.s3
                        @Override // wn0.a
                        public final Object invoke() {
                            return w3.b0(fVarC, dimension);
                        }
                    });
                    p013kotlin.jvm.internal.s.h(fVarC);
                    aVarL = fVarC;
                }
                if (aVarL != null) {
                    aVarL = eVarC;
                    aVarL = eVarC2;
                    aVarL = fVarC2;
                    aVarL = eVarC3;
                    aVarL = fVarC3;
                    aVarL = eVarC4;
                    aVarL = fVarC4;
                    aVarL = eVarC5;
                    aVarL = fVarC5;
                    aVarL = eVarC6;
                    aVarL = eVarC7;
                    aVarL = eVarC8;
                    aVarL = eVarC9;
                    aVarL = eVarC9;
                    aVarL = eVarC10;
                    aVarL = eVarC10;
                    aVarL = eVarC11;
                    return aVarL.getRoot();
                }
                aVarL = eVarC;
                aVarL = eVarC2;
                aVarL = fVarC2;
                aVarL = eVarC3;
                aVarL = fVarC3;
                aVarL = eVarC4;
                aVarL = fVarC4;
                aVarL = eVarC5;
                aVarL = fVarC5;
                aVarL = eVarC6;
                aVarL = eVarC7;
                aVarL = eVarC8;
                aVarL = eVarC9;
                aVarL = eVarC9;
                aVarL = eVarC10;
                aVarL = eVarC10;
                aVarL = eVarC11;
                return null;
            case 9:
                if (config.getStyles() != null) {
                    eVarC8 = bi0.e.c(uiComponentHelper.getLayoutInflater());
                    eVarC8.f17431b.setAnimation(yh0.o.f125578y);
                    uiComponentHelper.d(new wn0.a() { // from class: oi0.t3
                        @Override // wn0.a
                        public final Object invoke() {
                            return w3.d0(eVarC8, config);
                        }
                    });
                    p013kotlin.jvm.internal.s.h(eVarC8);
                } else {
                    fVarC = bi0.f.c(uiComponentHelper.getLayoutInflater());
                    fVarC.f17433b.setImageResource(yh0.l.f125530q);
                    uiComponentHelper.d(new wn0.a() { // from class: oi0.u3
                        @Override // wn0.a
                        public final Object invoke() {
                            return w3.e0(fVarC, dimension);
                        }
                    });
                    p013kotlin.jvm.internal.s.h(fVarC);
                    aVarL = fVarC;
                }
                if (aVarL != null) {
                    aVarL = eVarC;
                    aVarL = eVarC2;
                    aVarL = fVarC2;
                    aVarL = eVarC3;
                    aVarL = fVarC3;
                    aVarL = eVarC4;
                    aVarL = fVarC4;
                    aVarL = eVarC5;
                    aVarL = fVarC5;
                    aVarL = eVarC6;
                    aVarL = eVarC7;
                    aVarL = eVarC8;
                    aVarL = eVarC9;
                    aVarL = eVarC9;
                    aVarL = eVarC10;
                    aVarL = eVarC10;
                    aVarL = eVarC11;
                    return aVarL.getRoot();
                }
                aVarL = eVarC;
                aVarL = eVarC2;
                aVarL = fVarC2;
                aVarL = eVarC3;
                aVarL = fVarC3;
                aVarL = eVarC4;
                aVarL = fVarC4;
                aVarL = eVarC5;
                aVarL = fVarC5;
                aVarL = eVarC6;
                aVarL = eVarC7;
                aVarL = eVarC8;
                aVarL = eVarC9;
                aVarL = eVarC9;
                aVarL = eVarC10;
                aVarL = eVarC10;
                aVarL = eVarC11;
                return null;
            case 10:
                final bi0.e eVarC13 = bi0.e.c(uiComponentHelper.getLayoutInflater());
                eVarC13.f17431b.setAnimation(yh0.o.f125576w);
                eVarC13.f17431b.v();
                if (config.getStyles() != null) {
                    uiComponentHelper.d(new wn0.a() { // from class: oi0.v3
                        @Override // wn0.a
                        public final Object invoke() {
                            return w3.f0(eVarC13, config);
                        }
                    });
                } else {
                    ThemeableLottieAnimationView lottieView = eVarC13.f17431b;
                    p013kotlin.jvm.internal.s.j(lottieView, "lottieView");
                    ui0.g.g(lottieView, Integer.valueOf(yh0.s.d(context, zs.c.f128593t, null, false, 6, null)), Integer.valueOf(yh0.s.d(context, zs.c.f128595u, null, false, 6, null)), null, new String[]{"#190052"}, new String[]{"#F1EBFF", "#8552FF"}, new String[]{"#FFFFFF"});
                }
                uiComponentHelper.d(new wn0.a() { // from class: oi0.m2
                    @Override // wn0.a
                    public final Object invoke() {
                        return w3.g0(eVarC13);
                    }
                });
                aVarL = eVarC13;
                if (aVarL != null) {
                    aVarL = eVarC;
                    aVarL = eVarC2;
                    aVarL = fVarC2;
                    aVarL = eVarC3;
                    aVarL = fVarC3;
                    aVarL = eVarC4;
                    aVarL = fVarC4;
                    aVarL = eVarC5;
                    aVarL = fVarC5;
                    aVarL = eVarC6;
                    aVarL = eVarC7;
                    aVarL = eVarC8;
                    aVarL = eVarC9;
                    aVarL = eVarC9;
                    aVarL = eVarC10;
                    aVarL = eVarC10;
                    aVarL = eVarC11;
                    return aVarL.getRoot();
                }
                aVarL = eVarC;
                aVarL = eVarC2;
                aVarL = fVarC2;
                aVarL = eVarC3;
                aVarL = fVarC3;
                aVarL = eVarC4;
                aVarL = fVarC4;
                aVarL = eVarC5;
                aVarL = fVarC5;
                aVarL = eVarC6;
                aVarL = eVarC7;
                aVarL = eVarC8;
                aVarL = eVarC9;
                aVarL = eVarC9;
                aVarL = eVarC10;
                aVarL = eVarC10;
                aVarL = eVarC11;
                return null;
            case 11:
                eVarC9 = bi0.e.c(uiComponentHelper.getLayoutInflater());
                eVarC9.f17431b.setAnimation(yh0.o.f125577x);
                uiComponentHelper.d(new wn0.a() { // from class: oi0.o2
                    @Override // wn0.a
                    public final Object invoke() {
                        return w3.h0(eVarC9);
                    }
                });
                if (config.getStyles() != null) {
                    uiComponentHelper.d(new wn0.a() { // from class: oi0.p2
                        @Override // wn0.a
                        public final Object invoke() {
                            return w3.i0(eVarC9, config);
                        }
                    });
                } else {
                    ThemeableLottieAnimationView lottieView2 = eVarC9.f17431b;
                    p013kotlin.jvm.internal.s.j(lottieView2, "lottieView");
                    ui0.g.g(lottieView2, Integer.valueOf(yh0.s.d(context, zs.c.f128593t, null, false, 6, null)), Integer.valueOf(yh0.s.d(context, zs.c.f128595u, null, false, 6, null)), null, new String[]{"#02214F", "#190051"}, new String[]{"#E5E5EA"}, new String[0]);
                }
                if (aVarL != null) {
                    aVarL = eVarC;
                    aVarL = eVarC2;
                    aVarL = fVarC2;
                    aVarL = eVarC3;
                    aVarL = fVarC3;
                    aVarL = eVarC4;
                    aVarL = fVarC4;
                    aVarL = eVarC5;
                    aVarL = fVarC5;
                    aVarL = eVarC6;
                    aVarL = eVarC7;
                    aVarL = eVarC8;
                    aVarL = eVarC9;
                    aVarL = eVarC9;
                    aVarL = eVarC10;
                    aVarL = eVarC10;
                    aVarL = eVarC11;
                    return aVarL.getRoot();
                }
                aVarL = eVarC;
                aVarL = eVarC2;
                aVarL = fVarC2;
                aVarL = eVarC3;
                aVarL = fVarC3;
                aVarL = eVarC4;
                aVarL = fVarC4;
                aVarL = eVarC5;
                aVarL = fVarC5;
                aVarL = eVarC6;
                aVarL = eVarC7;
                aVarL = eVarC8;
                aVarL = eVarC9;
                aVarL = eVarC9;
                aVarL = eVarC10;
                aVarL = eVarC10;
                aVarL = eVarC11;
                return null;
            case 12:
                final bi0.e eVarC14 = bi0.e.c(uiComponentHelper.getLayoutInflater());
                eVarC14.f17431b.setAnimation(yh0.o.f125575v);
                if (config.getStyles() != null) {
                    uiComponentHelper.d(new wn0.a() { // from class: oi0.q2
                        @Override // wn0.a
                        public final Object invoke() {
                            return w3.j0(eVarC14, config);
                        }
                    });
                } else {
                    ThemeableLottieAnimationView lottieView3 = eVarC14.f17431b;
                    p013kotlin.jvm.internal.s.j(lottieView3, "lottieView");
                    ui0.g.g(lottieView3, Integer.valueOf(yh0.s.d(context, zs.c.f128593t, null, false, 6, null)), null, null, new String[]{"#280087"}, new String[0], new String[0]);
                }
                uiComponentHelper.d(new wn0.a() { // from class: oi0.r2
                    @Override // wn0.a
                    public final Object invoke() {
                        return w3.k0(eVarC14);
                    }
                });
                aVarL = eVarC14;
                if (aVarL != null) {
                    aVarL = eVarC;
                    aVarL = eVarC2;
                    aVarL = fVarC2;
                    aVarL = eVarC3;
                    aVarL = fVarC3;
                    aVarL = eVarC4;
                    aVarL = fVarC4;
                    aVarL = eVarC5;
                    aVarL = fVarC5;
                    aVarL = eVarC6;
                    aVarL = eVarC7;
                    aVarL = eVarC8;
                    aVarL = eVarC9;
                    aVarL = eVarC9;
                    aVarL = eVarC10;
                    aVarL = eVarC10;
                    aVarL = eVarC11;
                    return aVarL.getRoot();
                }
                aVarL = eVarC;
                aVarL = eVarC2;
                aVarL = fVarC2;
                aVarL = eVarC3;
                aVarL = fVarC3;
                aVarL = eVarC4;
                aVarL = fVarC4;
                aVarL = eVarC5;
                aVarL = fVarC5;
                aVarL = eVarC6;
                aVarL = eVarC7;
                aVarL = eVarC8;
                aVarL = eVarC9;
                aVarL = eVarC9;
                aVarL = eVarC10;
                aVarL = eVarC10;
                aVarL = eVarC11;
                return null;
            case 13:
                final bi0.e eVarC15 = bi0.e.c(uiComponentHelper.getLayoutInflater());
                eVarC15.f17431b.setAnimation(yh0.o.f125556c);
                eVarC15.f17431b.v();
                if (config.getStyles() != null) {
                    uiComponentHelper.d(new wn0.a() { // from class: oi0.s2
                        @Override // wn0.a
                        public final Object invoke() {
                            return w3.l0(eVarC15, config);
                        }
                    });
                } else {
                    ThemeableLottieAnimationView lottieView4 = eVarC15.f17431b;
                    p013kotlin.jvm.internal.s.j(lottieView4, "lottieView");
                    ui0.g.g(lottieView4, Integer.valueOf(yh0.s.d(context, zs.c.f128593t, null, false, 6, null)), Integer.valueOf(yh0.s.d(context, zs.c.f128595u, null, false, 6, null)), null, new String[]{"#280087", "#322A7E"}, new String[]{"#CBB1FF"}, new String[]{"#F1EBFF"});
                }
                uiComponentHelper.d(new wn0.a() { // from class: oi0.t2
                    @Override // wn0.a
                    public final Object invoke() {
                        return w3.m0(eVarC15);
                    }
                });
                aVarL = eVarC15;
                if (aVarL != null) {
                    aVarL = eVarC;
                    aVarL = eVarC2;
                    aVarL = fVarC2;
                    aVarL = eVarC3;
                    aVarL = fVarC3;
                    aVarL = eVarC4;
                    aVarL = fVarC4;
                    aVarL = eVarC5;
                    aVarL = fVarC5;
                    aVarL = eVarC6;
                    aVarL = eVarC7;
                    aVarL = eVarC8;
                    aVarL = eVarC9;
                    aVarL = eVarC9;
                    aVarL = eVarC10;
                    aVarL = eVarC10;
                    aVarL = eVarC11;
                    return aVarL.getRoot();
                }
                aVarL = eVarC;
                aVarL = eVarC2;
                aVarL = fVarC2;
                aVarL = eVarC3;
                aVarL = fVarC3;
                aVarL = eVarC4;
                aVarL = fVarC4;
                aVarL = eVarC5;
                aVarL = fVarC5;
                aVarL = eVarC6;
                aVarL = eVarC7;
                aVarL = eVarC8;
                aVarL = eVarC9;
                aVarL = eVarC9;
                aVarL = eVarC10;
                aVarL = eVarC10;
                aVarL = eVarC11;
                return null;
            case 14:
                final bi0.e eVarC16 = bi0.e.c(uiComponentHelper.getLayoutInflater());
                eVarC16.f17431b.setAnimation(yh0.o.f125558e);
                eVarC16.f17431b.v();
                if (config.getStyles() != null) {
                    uiComponentHelper.d(new wn0.a() { // from class: oi0.u2
                        @Override // wn0.a
                        public final Object invoke() {
                            return w3.o0(eVarC16, config);
                        }
                    });
                } else {
                    ThemeableLottieAnimationView lottieView5 = eVarC16.f17431b;
                    p013kotlin.jvm.internal.s.j(lottieView5, "lottieView");
                    ui0.g.g(lottieView5, Integer.valueOf(yh0.s.d(context, zs.c.f128593t, null, false, 6, null)), Integer.valueOf(yh0.s.d(context, zs.c.f128595u, null, false, 6, null)), null, new String[]{"#280087", "#322A7E"}, new String[]{"#CBB1FF"}, new String[]{"#F1EBFF"});
                }
                uiComponentHelper.d(new wn0.a() { // from class: oi0.v2
                    @Override // wn0.a
                    public final Object invoke() {
                        return w3.p0(eVarC16);
                    }
                });
                aVarL = eVarC16;
                if (aVarL != null) {
                    aVarL = eVarC;
                    aVarL = eVarC2;
                    aVarL = fVarC2;
                    aVarL = eVarC3;
                    aVarL = fVarC3;
                    aVarL = eVarC4;
                    aVarL = fVarC4;
                    aVarL = eVarC5;
                    aVarL = fVarC5;
                    aVarL = eVarC6;
                    aVarL = eVarC7;
                    aVarL = eVarC8;
                    aVarL = eVarC9;
                    aVarL = eVarC9;
                    aVarL = eVarC10;
                    aVarL = eVarC10;
                    aVarL = eVarC11;
                    return aVarL.getRoot();
                }
                aVarL = eVarC;
                aVarL = eVarC2;
                aVarL = fVarC2;
                aVarL = eVarC3;
                aVarL = fVarC3;
                aVarL = eVarC4;
                aVarL = fVarC4;
                aVarL = eVarC5;
                aVarL = fVarC5;
                aVarL = eVarC6;
                aVarL = eVarC7;
                aVarL = eVarC8;
                aVarL = eVarC9;
                aVarL = eVarC9;
                aVarL = eVarC10;
                aVarL = eVarC10;
                aVarL = eVarC11;
                return null;
            case 15:
                final bi0.e eVarC17 = bi0.e.c(uiComponentHelper.getLayoutInflater());
                eVarC17.f17431b.setAnimation(yh0.o.f125560g);
                eVarC17.f17431b.v();
                if (config.getStyles() != null) {
                    uiComponentHelper.d(new wn0.a() { // from class: oi0.x2
                        @Override // wn0.a
                        public final Object invoke() {
                            return w3.q0(eVarC17, config);
                        }
                    });
                } else {
                    ThemeableLottieAnimationView lottieView6 = eVarC17.f17431b;
                    p013kotlin.jvm.internal.s.j(lottieView6, "lottieView");
                    ui0.g.g(lottieView6, Integer.valueOf(yh0.s.d(context, zs.c.f128593t, null, false, 6, null)), Integer.valueOf(yh0.s.d(context, zs.c.f128595u, null, false, 6, null)), null, new String[]{"#280087", "#322A7E"}, new String[]{"#CBB1FF"}, new String[]{"#F1EBFF"});
                }
                uiComponentHelper.d(new wn0.a() { // from class: oi0.y2
                    @Override // wn0.a
                    public final Object invoke() {
                        return w3.r0(eVarC17);
                    }
                });
                aVarL = eVarC17;
                if (aVarL != null) {
                    aVarL = eVarC;
                    aVarL = eVarC2;
                    aVarL = fVarC2;
                    aVarL = eVarC3;
                    aVarL = fVarC3;
                    aVarL = eVarC4;
                    aVarL = fVarC4;
                    aVarL = eVarC5;
                    aVarL = fVarC5;
                    aVarL = eVarC6;
                    aVarL = eVarC7;
                    aVarL = eVarC8;
                    aVarL = eVarC9;
                    aVarL = eVarC9;
                    aVarL = eVarC10;
                    aVarL = eVarC10;
                    aVarL = eVarC11;
                    return aVarL.getRoot();
                }
                aVarL = eVarC;
                aVarL = eVarC2;
                aVarL = fVarC2;
                aVarL = eVarC3;
                aVarL = fVarC3;
                aVarL = eVarC4;
                aVarL = fVarC4;
                aVarL = eVarC5;
                aVarL = fVarC5;
                aVarL = eVarC6;
                aVarL = eVarC7;
                aVarL = eVarC8;
                aVarL = eVarC9;
                aVarL = eVarC9;
                aVarL = eVarC10;
                aVarL = eVarC10;
                aVarL = eVarC11;
                return null;
            case 16:
                final bi0.e eVarC18 = bi0.e.c(uiComponentHelper.getLayoutInflater());
                eVarC18.f17431b.setAnimation(yh0.o.f125559f);
                eVarC18.f17431b.v();
                if (config.getStyles() != null) {
                    uiComponentHelper.d(new wn0.a() { // from class: oi0.a3
                        @Override // wn0.a
                        public final Object invoke() {
                            return w3.s0(eVarC18, config);
                        }
                    });
                } else {
                    ThemeableLottieAnimationView lottieView7 = eVarC18.f17431b;
                    p013kotlin.jvm.internal.s.j(lottieView7, "lottieView");
                    ui0.g.g(lottieView7, Integer.valueOf(yh0.s.d(context, zs.c.f128593t, null, false, 6, null)), Integer.valueOf(yh0.s.d(context, zs.c.f128595u, null, false, 6, null)), null, new String[]{"#280087", "#322A7E"}, new String[]{"#CBB1FF"}, new String[]{"#F1EBFF"});
                }
                uiComponentHelper.d(new wn0.a() { // from class: oi0.b3
                    @Override // wn0.a
                    public final Object invoke() {
                        return w3.t0(eVarC18);
                    }
                });
                aVarL = eVarC18;
                if (aVarL != null) {
                    aVarL = eVarC;
                    aVarL = eVarC2;
                    aVarL = fVarC2;
                    aVarL = eVarC3;
                    aVarL = fVarC3;
                    aVarL = eVarC4;
                    aVarL = fVarC4;
                    aVarL = eVarC5;
                    aVarL = fVarC5;
                    aVarL = eVarC6;
                    aVarL = eVarC7;
                    aVarL = eVarC8;
                    aVarL = eVarC9;
                    aVarL = eVarC9;
                    aVarL = eVarC10;
                    aVarL = eVarC10;
                    aVarL = eVarC11;
                    return aVarL.getRoot();
                }
                aVarL = eVarC;
                aVarL = eVarC2;
                aVarL = fVarC2;
                aVarL = eVarC3;
                aVarL = fVarC3;
                aVarL = eVarC4;
                aVarL = fVarC4;
                aVarL = eVarC5;
                aVarL = fVarC5;
                aVarL = eVarC6;
                aVarL = eVarC7;
                aVarL = eVarC8;
                aVarL = eVarC9;
                aVarL = eVarC9;
                aVarL = eVarC10;
                aVarL = eVarC10;
                aVarL = eVarC11;
                return null;
            case 17:
                final bi0.e eVarC19 = bi0.e.c(uiComponentHelper.getLayoutInflater());
                eVarC19.f17431b.setAnimation(yh0.o.f125557d);
                eVarC19.f17431b.v();
                if (config.getStyles() != null) {
                    uiComponentHelper.d(new wn0.a() { // from class: oi0.c3
                        @Override // wn0.a
                        public final Object invoke() {
                            return w3.u0(eVarC19, config);
                        }
                    });
                } else {
                    ThemeableLottieAnimationView lottieView8 = eVarC19.f17431b;
                    p013kotlin.jvm.internal.s.j(lottieView8, "lottieView");
                    ui0.g.g(lottieView8, Integer.valueOf(yh0.s.d(context, zs.c.f128593t, null, false, 6, null)), Integer.valueOf(yh0.s.d(context, zs.c.f128595u, null, false, 6, null)), null, new String[]{"#280087", "#322A7E"}, new String[]{"#CBB1FF"}, new String[]{"#F1EBFF"});
                }
                uiComponentHelper.d(new wn0.a() { // from class: oi0.d3
                    @Override // wn0.a
                    public final Object invoke() {
                        return w3.v0(eVarC19);
                    }
                });
                aVarL = eVarC19;
                if (aVarL != null) {
                    aVarL = eVarC;
                    aVarL = eVarC2;
                    aVarL = fVarC2;
                    aVarL = eVarC3;
                    aVarL = fVarC3;
                    aVarL = eVarC4;
                    aVarL = fVarC4;
                    aVarL = eVarC5;
                    aVarL = fVarC5;
                    aVarL = eVarC6;
                    aVarL = eVarC7;
                    aVarL = eVarC8;
                    aVarL = eVarC9;
                    aVarL = eVarC9;
                    aVarL = eVarC10;
                    aVarL = eVarC10;
                    aVarL = eVarC11;
                    return aVarL.getRoot();
                }
                aVarL = eVarC;
                aVarL = eVarC2;
                aVarL = fVarC2;
                aVarL = eVarC3;
                aVarL = fVarC3;
                aVarL = eVarC4;
                aVarL = fVarC4;
                aVarL = eVarC5;
                aVarL = fVarC5;
                aVarL = eVarC6;
                aVarL = eVarC7;
                aVarL = eVarC8;
                aVarL = eVarC9;
                aVarL = eVarC9;
                aVarL = eVarC10;
                aVarL = eVarC10;
                aVarL = eVarC11;
                return null;
            case 18:
                eVarC10 = bi0.e.c(uiComponentHelper.getLayoutInflater());
                eVarC10.f17431b.setImageResource(mi0.d.f92153a);
                if (config.getStyles() != null) {
                    ThemeableLottieAnimationView lottieView9 = eVarC10.f17431b;
                    p013kotlin.jvm.internal.s.j(lottieView9, "lottieView");
                    ui0.g.c(lottieView9, config.getStyles(), new String[0], new String[0], new String[0]);
                } else {
                    uiComponentHelper.d(new wn0.a() { // from class: oi0.e3
                        @Override // wn0.a
                        public final Object invoke() {
                            return w3.w0(eVarC10);
                        }
                    });
                }
                if (aVarL != null) {
                    aVarL = eVarC;
                    aVarL = eVarC2;
                    aVarL = fVarC2;
                    aVarL = eVarC3;
                    aVarL = fVarC3;
                    aVarL = eVarC4;
                    aVarL = fVarC4;
                    aVarL = eVarC5;
                    aVarL = fVarC5;
                    aVarL = eVarC6;
                    aVarL = eVarC7;
                    aVarL = eVarC8;
                    aVarL = eVarC9;
                    aVarL = eVarC9;
                    aVarL = eVarC10;
                    aVarL = eVarC10;
                    aVarL = eVarC11;
                    return aVarL.getRoot();
                }
                aVarL = eVarC;
                aVarL = eVarC2;
                aVarL = fVarC2;
                aVarL = eVarC3;
                aVarL = fVarC3;
                aVarL = eVarC4;
                aVarL = fVarC4;
                aVarL = eVarC5;
                aVarL = fVarC5;
                aVarL = eVarC6;
                aVarL = eVarC7;
                aVarL = eVarC8;
                aVarL = eVarC9;
                aVarL = eVarC9;
                aVarL = eVarC10;
                aVarL = eVarC10;
                aVarL = eVarC11;
                return null;
            case 19:
                aVarL = L(localImageComponent, uiComponentHelper, yh0.o.f125566m, yh0.l.f125514a, new String[0], new String[0], config);
                if (aVarL != null) {
                    aVarL = eVarC;
                    aVarL = eVarC2;
                    aVarL = fVarC2;
                    aVarL = eVarC3;
                    aVarL = fVarC3;
                    aVarL = eVarC4;
                    aVarL = fVarC4;
                    aVarL = eVarC5;
                    aVarL = fVarC5;
                    aVarL = eVarC6;
                    aVarL = eVarC7;
                    aVarL = eVarC8;
                    aVarL = eVarC9;
                    aVarL = eVarC9;
                    aVarL = eVarC10;
                    aVarL = eVarC10;
                    aVarL = eVarC11;
                    return aVarL.getRoot();
                }
                aVarL = eVarC;
                aVarL = eVarC2;
                aVarL = fVarC2;
                aVarL = eVarC3;
                aVarL = fVarC3;
                aVarL = eVarC4;
                aVarL = fVarC4;
                aVarL = eVarC5;
                aVarL = fVarC5;
                aVarL = eVarC6;
                aVarL = eVarC7;
                aVarL = eVarC8;
                aVarL = eVarC9;
                aVarL = eVarC9;
                aVarL = eVarC10;
                aVarL = eVarC10;
                aVarL = eVarC11;
                return null;
            case 20:
                aVarL = L(localImageComponent, uiComponentHelper, yh0.o.f125567n, yh0.l.f125515b, new String[]{"#000000"}, new String[0], config);
                if (aVarL != null) {
                    aVarL = eVarC;
                    aVarL = eVarC2;
                    aVarL = fVarC2;
                    aVarL = eVarC3;
                    aVarL = fVarC3;
                    aVarL = eVarC4;
                    aVarL = fVarC4;
                    aVarL = eVarC5;
                    aVarL = fVarC5;
                    aVarL = eVarC6;
                    aVarL = eVarC7;
                    aVarL = eVarC8;
                    aVarL = eVarC9;
                    aVarL = eVarC9;
                    aVarL = eVarC10;
                    aVarL = eVarC10;
                    aVarL = eVarC11;
                    return aVarL.getRoot();
                }
                aVarL = eVarC;
                aVarL = eVarC2;
                aVarL = fVarC2;
                aVarL = eVarC3;
                aVarL = fVarC3;
                aVarL = eVarC4;
                aVarL = fVarC4;
                aVarL = eVarC5;
                aVarL = fVarC5;
                aVarL = eVarC6;
                aVarL = eVarC7;
                aVarL = eVarC8;
                aVarL = eVarC9;
                aVarL = eVarC9;
                aVarL = eVarC10;
                aVarL = eVarC10;
                aVarL = eVarC11;
                return null;
            case 21:
                aVarL = L(localImageComponent, uiComponentHelper, yh0.o.f125568o, yh0.l.f125516c, new String[]{"#FFFFFF"}, new String[]{"#000000"}, config);
                if (aVarL != null) {
                    aVarL = eVarC;
                    aVarL = eVarC2;
                    aVarL = fVarC2;
                    aVarL = eVarC3;
                    aVarL = fVarC3;
                    aVarL = eVarC4;
                    aVarL = fVarC4;
                    aVarL = eVarC5;
                    aVarL = fVarC5;
                    aVarL = eVarC6;
                    aVarL = eVarC7;
                    aVarL = eVarC8;
                    aVarL = eVarC9;
                    aVarL = eVarC9;
                    aVarL = eVarC10;
                    aVarL = eVarC10;
                    aVarL = eVarC11;
                    return aVarL.getRoot();
                }
                aVarL = eVarC;
                aVarL = eVarC2;
                aVarL = fVarC2;
                aVarL = eVarC3;
                aVarL = fVarC3;
                aVarL = eVarC4;
                aVarL = fVarC4;
                aVarL = eVarC5;
                aVarL = fVarC5;
                aVarL = eVarC6;
                aVarL = eVarC7;
                aVarL = eVarC8;
                aVarL = eVarC9;
                aVarL = eVarC9;
                aVarL = eVarC10;
                aVarL = eVarC10;
                aVarL = eVarC11;
                return null;
            case 22:
                aVarL = L(localImageComponent, uiComponentHelper, yh0.o.f125569p, yh0.l.f125517d, new String[]{"#FFFFFF"}, new String[]{"#000000"}, config);
                if (aVarL != null) {
                    aVarL = eVarC;
                    aVarL = eVarC2;
                    aVarL = fVarC2;
                    aVarL = eVarC3;
                    aVarL = fVarC3;
                    aVarL = eVarC4;
                    aVarL = fVarC4;
                    aVarL = eVarC5;
                    aVarL = fVarC5;
                    aVarL = eVarC6;
                    aVarL = eVarC7;
                    aVarL = eVarC8;
                    aVarL = eVarC9;
                    aVarL = eVarC9;
                    aVarL = eVarC10;
                    aVarL = eVarC10;
                    aVarL = eVarC11;
                    return aVarL.getRoot();
                }
                aVarL = eVarC;
                aVarL = eVarC2;
                aVarL = fVarC2;
                aVarL = eVarC3;
                aVarL = fVarC3;
                aVarL = eVarC4;
                aVarL = fVarC4;
                aVarL = eVarC5;
                aVarL = fVarC5;
                aVarL = eVarC6;
                aVarL = eVarC7;
                aVarL = eVarC8;
                aVarL = eVarC9;
                aVarL = eVarC9;
                aVarL = eVarC10;
                aVarL = eVarC10;
                aVarL = eVarC11;
                return null;
            case 23:
                aVarL = L(localImageComponent, uiComponentHelper, yh0.o.f125570q, yh0.l.f125518e, new String[]{"#FFFFFF"}, new String[]{"#000000"}, config);
                if (aVarL != null) {
                    aVarL = eVarC;
                    aVarL = eVarC2;
                    aVarL = fVarC2;
                    aVarL = eVarC3;
                    aVarL = fVarC3;
                    aVarL = eVarC4;
                    aVarL = fVarC4;
                    aVarL = eVarC5;
                    aVarL = fVarC5;
                    aVarL = eVarC6;
                    aVarL = eVarC7;
                    aVarL = eVarC8;
                    aVarL = eVarC9;
                    aVarL = eVarC9;
                    aVarL = eVarC10;
                    aVarL = eVarC10;
                    aVarL = eVarC11;
                    return aVarL.getRoot();
                }
                aVarL = eVarC;
                aVarL = eVarC2;
                aVarL = fVarC2;
                aVarL = eVarC3;
                aVarL = fVarC3;
                aVarL = eVarC4;
                aVarL = fVarC4;
                aVarL = eVarC5;
                aVarL = fVarC5;
                aVarL = eVarC6;
                aVarL = eVarC7;
                aVarL = eVarC8;
                aVarL = eVarC9;
                aVarL = eVarC9;
                aVarL = eVarC10;
                aVarL = eVarC10;
                aVarL = eVarC11;
                return null;
            case 24:
                aVarL = L(localImageComponent, uiComponentHelper, yh0.o.f125571r, yh0.l.f125519f, new String[]{"#FFFFFF"}, new String[]{"#000000"}, config);
                if (aVarL != null) {
                    aVarL = eVarC;
                    aVarL = eVarC2;
                    aVarL = fVarC2;
                    aVarL = eVarC3;
                    aVarL = fVarC3;
                    aVarL = eVarC4;
                    aVarL = fVarC4;
                    aVarL = eVarC5;
                    aVarL = fVarC5;
                    aVarL = eVarC6;
                    aVarL = eVarC7;
                    aVarL = eVarC8;
                    aVarL = eVarC9;
                    aVarL = eVarC9;
                    aVarL = eVarC10;
                    aVarL = eVarC10;
                    aVarL = eVarC11;
                    return aVarL.getRoot();
                }
                aVarL = eVarC;
                aVarL = eVarC2;
                aVarL = fVarC2;
                aVarL = eVarC3;
                aVarL = fVarC3;
                aVarL = eVarC4;
                aVarL = fVarC4;
                aVarL = eVarC5;
                aVarL = fVarC5;
                aVarL = eVarC6;
                aVarL = eVarC7;
                aVarL = eVarC8;
                aVarL = eVarC9;
                aVarL = eVarC9;
                aVarL = eVarC10;
                aVarL = eVarC10;
                aVarL = eVarC11;
                return null;
            case 25:
                aVarL = L(localImageComponent, uiComponentHelper, yh0.o.f125572s, yh0.l.f125520g, new String[]{"#FFFFFF"}, new String[]{"#000000"}, config);
                if (aVarL != null) {
                    aVarL = eVarC;
                    aVarL = eVarC2;
                    aVarL = fVarC2;
                    aVarL = eVarC3;
                    aVarL = fVarC3;
                    aVarL = eVarC4;
                    aVarL = fVarC4;
                    aVarL = eVarC5;
                    aVarL = fVarC5;
                    aVarL = eVarC6;
                    aVarL = eVarC7;
                    aVarL = eVarC8;
                    aVarL = eVarC9;
                    aVarL = eVarC9;
                    aVarL = eVarC10;
                    aVarL = eVarC10;
                    aVarL = eVarC11;
                    return aVarL.getRoot();
                }
                aVarL = eVarC;
                aVarL = eVarC2;
                aVarL = fVarC2;
                aVarL = eVarC3;
                aVarL = fVarC3;
                aVarL = eVarC4;
                aVarL = fVarC4;
                aVarL = eVarC5;
                aVarL = fVarC5;
                aVarL = eVarC6;
                aVarL = eVarC7;
                aVarL = eVarC8;
                aVarL = eVarC9;
                aVarL = eVarC9;
                aVarL = eVarC10;
                aVarL = eVarC10;
                aVarL = eVarC11;
                return null;
            case 26:
                aVarL = L(localImageComponent, uiComponentHelper, yh0.o.f125573t, yh0.l.f125521h, new String[]{"#FFFFFF"}, new String[]{"#000000"}, config);
                if (aVarL != null) {
                    aVarL = eVarC;
                    aVarL = eVarC2;
                    aVarL = fVarC2;
                    aVarL = eVarC3;
                    aVarL = fVarC3;
                    aVarL = eVarC4;
                    aVarL = fVarC4;
                    aVarL = eVarC5;
                    aVarL = fVarC5;
                    aVarL = eVarC6;
                    aVarL = eVarC7;
                    aVarL = eVarC8;
                    aVarL = eVarC9;
                    aVarL = eVarC9;
                    aVarL = eVarC10;
                    aVarL = eVarC10;
                    aVarL = eVarC11;
                    return aVarL.getRoot();
                }
                aVarL = eVarC;
                aVarL = eVarC2;
                aVarL = fVarC2;
                aVarL = eVarC3;
                aVarL = fVarC3;
                aVarL = eVarC4;
                aVarL = fVarC4;
                aVarL = eVarC5;
                aVarL = fVarC5;
                aVarL = eVarC6;
                aVarL = eVarC7;
                aVarL = eVarC8;
                aVarL = eVarC9;
                aVarL = eVarC9;
                aVarL = eVarC10;
                aVarL = eVarC10;
                aVarL = eVarC11;
                return null;
            case 27:
                aVarL = L(localImageComponent, uiComponentHelper, yh0.o.f125574u, yh0.l.f125522i, new String[]{"#FFFFFF"}, new String[]{"#000000"}, config);
                if (aVarL != null) {
                    aVarL = eVarC;
                    aVarL = eVarC2;
                    aVarL = fVarC2;
                    aVarL = eVarC3;
                    aVarL = fVarC3;
                    aVarL = eVarC4;
                    aVarL = fVarC4;
                    aVarL = eVarC5;
                    aVarL = fVarC5;
                    aVarL = eVarC6;
                    aVarL = eVarC7;
                    aVarL = eVarC8;
                    aVarL = eVarC9;
                    aVarL = eVarC9;
                    aVarL = eVarC10;
                    aVarL = eVarC10;
                    aVarL = eVarC11;
                    return aVarL.getRoot();
                }
                aVarL = eVarC;
                aVarL = eVarC2;
                aVarL = fVarC2;
                aVarL = eVarC3;
                aVarL = fVarC3;
                aVarL = eVarC4;
                aVarL = fVarC4;
                aVarL = eVarC5;
                aVarL = fVarC5;
                aVarL = eVarC6;
                aVarL = eVarC7;
                aVarL = eVarC8;
                aVarL = eVarC9;
                aVarL = eVarC9;
                aVarL = eVarC10;
                aVarL = eVarC10;
                aVarL = eVarC11;
                return null;
            case 28:
                eVarC11 = bi0.e.c(uiComponentHelper.getLayoutInflater());
                eVarC11.f17431b.setImageResource(mi0.d.f92157e);
                aVarL = eVarC11;
                if (config.getStyles() != null) {
                    ThemeableLottieAnimationView lottieView10 = eVarC11.f17431b;
                    p013kotlin.jvm.internal.s.j(lottieView10, "lottieView");
                    ui0.g.c(lottieView10, config.getStyles(), new String[0], new String[0], new String[0]);
                }
                if (aVarL != null) {
                    aVarL = eVarC;
                    aVarL = eVarC2;
                    aVarL = fVarC2;
                    aVarL = eVarC3;
                    aVarL = fVarC3;
                    aVarL = eVarC4;
                    aVarL = fVarC4;
                    aVarL = eVarC5;
                    aVarL = fVarC5;
                    aVarL = eVarC6;
                    aVarL = eVarC7;
                    aVarL = eVarC8;
                    aVarL = eVarC9;
                    aVarL = eVarC9;
                    aVarL = eVarC10;
                    aVarL = eVarC10;
                    aVarL = eVarC11;
                    return aVarL.getRoot();
                }
                aVarL = eVarC;
                aVarL = eVarC2;
                aVarL = fVarC2;
                aVarL = eVarC3;
                aVarL = fVarC3;
                aVarL = eVarC4;
                aVarL = fVarC4;
                aVarL = eVarC5;
                aVarL = fVarC5;
                aVarL = eVarC6;
                aVarL = eVarC7;
                aVarL = eVarC8;
                aVarL = eVarC9;
                aVarL = eVarC9;
                aVarL = eVarC10;
                aVarL = eVarC10;
                aVarL = eVarC11;
                return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 P(bi0.e eVar, LocalImage localImage) {
        ThemeableLottieAnimationView lottieView = eVar.f17431b;
        p013kotlin.jvm.internal.s.j(lottieView, "lottieView");
        ui0.g.c(lottieView, localImage.getStyles(), new String[]{"#02214F"}, new String[]{"#AA84FF", "#F2EAFF"}, new String[]{"#FFFFFF"});
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 Q(bi0.e eVar) {
        ThemeableLottieAnimationView lottieView = eVar.f17431b;
        p013kotlin.jvm.internal.s.j(lottieView, "lottieView");
        ViewGroup.LayoutParams layoutParams = lottieView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        if (layoutParams instanceof ConstraintLayout.b) {
            ((ConstraintLayout.b) layoutParams).V = 0.5f;
        }
        lottieView.setLayoutParams(layoutParams);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void R(bi0.e eVar, tf.i iVar) {
        eVar.f17431b.v();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 S(bi0.e eVar, LocalImage localImage) {
        ThemeableLottieAnimationView lottieView = eVar.f17431b;
        p013kotlin.jvm.internal.s.j(lottieView, "lottieView");
        ui0.g.c(lottieView, localImage.getStyles(), new String[]{"#02214F"}, new String[]{"#AA84FF"}, new String[0]);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 T(bi0.f fVar, int i11) {
        ImageView imageView = fVar.f17433b;
        p013kotlin.jvm.internal.s.j(imageView, "imageView");
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = i11;
        imageView.setLayoutParams(layoutParams);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 U(bi0.e eVar, LocalImage localImage) {
        ThemeableLottieAnimationView lottieView = eVar.f17431b;
        p013kotlin.jvm.internal.s.j(lottieView, "lottieView");
        ui0.g.c(lottieView, localImage.getStyles(), new String[]{"#190051"}, new String[]{"#AA84FF"}, new String[0]);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 V(bi0.f fVar, int i11) {
        ImageView imageView = fVar.f17433b;
        p013kotlin.jvm.internal.s.j(imageView, "imageView");
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = i11;
        imageView.setLayoutParams(layoutParams);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 W(bi0.e eVar, LocalImage localImage) {
        ThemeableLottieAnimationView lottieView = eVar.f17431b;
        p013kotlin.jvm.internal.s.j(lottieView, "lottieView");
        ui0.g.c(lottieView, localImage.getStyles(), new String[]{"#190051"}, new String[]{"#AA84FF"}, new String[0]);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 X(bi0.f fVar, int i11) {
        ImageView imageView = fVar.f17433b;
        p013kotlin.jvm.internal.s.j(imageView, "imageView");
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = i11;
        imageView.setLayoutParams(layoutParams);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 Y(bi0.e eVar, LocalImage localImage) {
        ThemeableLottieAnimationView lottieView = eVar.f17431b;
        p013kotlin.jvm.internal.s.j(lottieView, "lottieView");
        ui0.g.c(lottieView, localImage.getStyles(), new String[]{"#190051"}, new String[]{"#AA84FF"}, new String[0]);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 Z(bi0.f fVar, int i11) {
        ImageView imageView = fVar.f17433b;
        p013kotlin.jvm.internal.s.j(imageView, "imageView");
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = i11;
        imageView.setLayoutParams(layoutParams);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a0(bi0.e eVar, LocalImage localImage) {
        ThemeableLottieAnimationView lottieView = eVar.f17431b;
        p013kotlin.jvm.internal.s.j(lottieView, "lottieView");
        ui0.g.c(lottieView, localImage.getStyles(), new String[]{"#4C4293"}, new String[]{"#B5B5CC"}, new String[0]);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 b0(bi0.f fVar, int i11) {
        ImageView imageView = fVar.f17433b;
        p013kotlin.jvm.internal.s.j(imageView, "imageView");
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = i11;
        imageView.setLayoutParams(layoutParams);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 c0(bi0.f fVar, int i11) {
        ImageView imageView = fVar.f17433b;
        p013kotlin.jvm.internal.s.j(imageView, "imageView");
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = i11;
        imageView.setLayoutParams(layoutParams);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 d0(bi0.e eVar, LocalImage localImage) {
        ThemeableLottieAnimationView lottieView = eVar.f17431b;
        p013kotlin.jvm.internal.s.j(lottieView, "lottieView");
        ui0.g.c(lottieView, localImage.getStyles(), new String[]{"#190051", "#02214F"}, new String[]{"#AA84FF"}, new String[]{"#AA84FF"});
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 e0(bi0.f fVar, int i11) {
        ImageView imageView = fVar.f17433b;
        p013kotlin.jvm.internal.s.j(imageView, "imageView");
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = i11;
        imageView.setLayoutParams(layoutParams);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 f0(bi0.e eVar, LocalImage localImage) {
        ThemeableLottieAnimationView lottieView = eVar.f17431b;
        p013kotlin.jvm.internal.s.j(lottieView, "lottieView");
        ui0.g.c(lottieView, localImage.getStyles(), new String[]{"#190052"}, new String[]{"#F1EBFF", "#8552FF"}, new String[]{"#FFFFFF"});
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 g0(bi0.e eVar) {
        eVar.f17431b.setRepeatMode(1);
        eVar.f17431b.setRepeatCount(-1);
        eVar.f17431b.v();
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 h0(bi0.e eVar) {
        ThemeableLottieAnimationView lottieView = eVar.f17431b;
        p013kotlin.jvm.internal.s.j(lottieView, "lottieView");
        ViewGroup.LayoutParams layoutParams = lottieView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        if (layoutParams instanceof ConstraintLayout.b) {
            ((ConstraintLayout.b) layoutParams).V = 0.5f;
        }
        lottieView.setLayoutParams(layoutParams);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 i0(bi0.e eVar, LocalImage localImage) {
        ThemeableLottieAnimationView lottieView = eVar.f17431b;
        p013kotlin.jvm.internal.s.j(lottieView, "lottieView");
        ui0.g.c(lottieView, localImage.getStyles(), new String[]{"#02214F", "#190051"}, new String[]{"#E5E5EA"}, new String[0]);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 j0(bi0.e eVar, LocalImage localImage) {
        ThemeableLottieAnimationView lottieView = eVar.f17431b;
        p013kotlin.jvm.internal.s.j(lottieView, "lottieView");
        ui0.g.c(lottieView, localImage.getStyles(), new String[]{"#280087"}, new String[0], new String[0]);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 k0(bi0.e eVar) {
        ThemeableLottieAnimationView lottieView = eVar.f17431b;
        p013kotlin.jvm.internal.s.j(lottieView, "lottieView");
        ViewGroup.LayoutParams layoutParams = lottieView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        if (layoutParams instanceof ConstraintLayout.b) {
            ((ConstraintLayout.b) layoutParams).V = 0.5f;
        }
        lottieView.setLayoutParams(layoutParams);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 l0(bi0.e eVar, LocalImage localImage) {
        ThemeableLottieAnimationView lottieView = eVar.f17431b;
        p013kotlin.jvm.internal.s.j(lottieView, "lottieView");
        ui0.g.c(lottieView, localImage.getStyles(), new String[]{"#280087", "#322A7E"}, new String[]{"#CBB1FF"}, new String[]{"#F1EBFF"});
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 m0(bi0.e eVar) {
        eVar.f17431b.setRepeatMode(1);
        eVar.f17431b.setRepeatCount(-1);
        eVar.f17431b.v();
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 n0(bi0.e eVar, LocalImage localImage) {
        ThemeableLottieAnimationView lottieView = eVar.f17431b;
        p013kotlin.jvm.internal.s.j(lottieView, "lottieView");
        ui0.g.c(lottieView, localImage.getStyles(), new String[]{"#190051"}, new String[]{"#AA84FF", "#F2EAFF"}, new String[]{"#FFFFFF"});
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 o0(bi0.e eVar, LocalImage localImage) {
        ThemeableLottieAnimationView lottieView = eVar.f17431b;
        p013kotlin.jvm.internal.s.j(lottieView, "lottieView");
        ui0.g.c(lottieView, localImage.getStyles(), new String[]{"#280087", "#322A7E"}, new String[]{"#CBB1FF"}, new String[]{"#F1EBFF"});
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 p0(bi0.e eVar) {
        eVar.f17431b.setRepeatMode(1);
        eVar.f17431b.setRepeatCount(-1);
        eVar.f17431b.v();
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 q0(bi0.e eVar, LocalImage localImage) {
        ThemeableLottieAnimationView lottieView = eVar.f17431b;
        p013kotlin.jvm.internal.s.j(lottieView, "lottieView");
        ui0.g.c(lottieView, localImage.getStyles(), new String[]{"#280087", "#322A7E"}, new String[]{"#CBB1FF"}, new String[]{"#F1EBFF"});
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 r0(bi0.e eVar) {
        eVar.f17431b.setRepeatMode(1);
        eVar.f17431b.setRepeatCount(-1);
        eVar.f17431b.v();
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 s0(bi0.e eVar, LocalImage localImage) {
        ThemeableLottieAnimationView lottieView = eVar.f17431b;
        p013kotlin.jvm.internal.s.j(lottieView, "lottieView");
        ui0.g.c(lottieView, localImage.getStyles(), new String[]{"#280087", "#322A7E"}, new String[]{"#CBB1FF"}, new String[]{"#F1EBFF"});
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 t0(bi0.e eVar) {
        eVar.f17431b.setRepeatMode(1);
        eVar.f17431b.setRepeatCount(-1);
        eVar.f17431b.v();
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 u0(bi0.e eVar, LocalImage localImage) {
        ThemeableLottieAnimationView lottieView = eVar.f17431b;
        p013kotlin.jvm.internal.s.j(lottieView, "lottieView");
        ui0.g.c(lottieView, localImage.getStyles(), new String[]{"#280087", "#322A7E"}, new String[]{"#CBB1FF"}, new String[]{"#F1EBFF"});
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 v0(bi0.e eVar) {
        eVar.f17431b.setRepeatMode(1);
        eVar.f17431b.setRepeatCount(-1);
        eVar.f17431b.v();
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 w0(bi0.e eVar) {
        ThemeableLottieAnimationView lottieView = eVar.f17431b;
        p013kotlin.jvm.internal.s.j(lottieView, "lottieView");
        ViewGroup.LayoutParams layoutParams = lottieView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = (int) yh0.h.a(44.0d);
        lottieView.setLayoutParams(layoutParams);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 x0(bi0.f fVar, int i11) {
        ImageView imageView = fVar.f17433b;
        p013kotlin.jvm.internal.s.j(imageView, "imageView");
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = i11;
        imageView.setLayoutParams(layoutParams);
        return jn0.h0.f84049a;
    }
}
