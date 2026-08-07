package atd.at;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import atd.a.getMessageVersion;
import atd.ax.getSDKReferenceNumber;
import atd.az.getTransactionStatus;
import atd.e.getAdditionalDetails;
import com.adyen.threeds2.R;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.reflect.Method;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes3.dex */
public abstract class getDeviceData<C extends getAdditionalDetails, L extends atd.ax.getSDKReferenceNumber> extends AuthenticationRequestParameters<C, L> implements View.OnClickListener {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int ChallengeResultError;
    private static int ChallengeResultTimeout;
    private static long getTransactionStatus;
    private final Button AuthenticationRequestParameters;
    private final atd.av.getSDKTransactionID BuildConfig;
    private final ImageView ChallengeResult;
    private final atd.av.getSDKTransactionID ChallengeResultCancelled;
    private final SwitchCompat ChallengeResultCompleted;
    private final TextView getDeviceData;
    private final ImageView getMessageVersion;
    private final ImageView getSDKAppID;
    private final View getSDKEphemeralPublicKey;
    private final TextView getSDKReferenceNumber;
    private final TextView getSDKTransactionID;

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        ChallengeResultTimeout = 0;
        ChallengeResultError = 1;
        getTransactionStatus = -4058221958697812999L;
    }

    getDeviceData(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        View.inflate(context, getSDKAppID(), (ViewGroup) findViewById(R.id.linearLayout_challengeContainer));
        this.getSDKReferenceNumber = (TextView) findViewById(R.id.textView_infoHeader);
        this.getSDKTransactionID = (TextView) findViewById(R.id.textView_infoText);
        this.getDeviceData = (TextView) findViewById(R.id.textView_infoLabel);
        this.getSDKAppID = (ImageView) findViewById(R.id.imageView_infoTextIndicator);
        this.AuthenticationRequestParameters = (Button) findViewById(R.id.button_resend);
        this.BuildConfig = (atd.av.getSDKTransactionID) findViewById(R.id.expandableInfoText_why);
        this.ChallengeResultCancelled = (atd.av.getSDKTransactionID) findViewById(R.id.expandableInfoText_explained);
        this.getSDKEphemeralPublicKey = findViewById(R.id.dividerView_logos);
        this.ChallengeResult = (ImageView) findViewById(R.id.imageView_issuer);
        this.getMessageVersion = (ImageView) findViewById(R.id.imageView_scheme);
        this.ChallengeResultCompleted = (SwitchCompat) findViewById(R.id.switch_whitelist);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x017b  */
    /* JADX WARN: Code duplicated, block: B:40:0x017c  */
    /* JADX WARN: Code duplicated, block: B:8:0x0025  */
    /* JADX WARN: Code duplicated, block: B:9:0x0032  */
    private static void a(String str, int i11, Object[] objArr) throws Throwable {
        Object charArray;
        Throwable cause;
        int i12;
        Object method;
        int i13 = $11 + 85;
        $10 = i13 % 128;
        char c11 = 2;
        int i14 = 0;
        if (i13 % 2 != 0) {
            int i15 = 45 / 0;
            if (str != null) {
                charArray = str.toCharArray();
                $11 = ($10 + 17) % 128;
            } else {
                charArray = str;
            }
        } else if (str != null) {
            charArray = str.toCharArray();
            $11 = ($10 + 17) % 128;
        } else {
            charArray = str;
        }
        char[] cArr = (char[]) charArray;
        getTransactionStatus gettransactionstatus = new getTransactionStatus();
        gettransactionstatus.getSDKAppID = i11;
        int length = cArr.length;
        long[] jArr = new long[length];
        gettransactionstatus.getSDKTransactionID = 0;
        while (true) {
            int i16 = gettransactionstatus.getSDKTransactionID;
            if (i16 >= cArr.length) {
                break;
            }
            char c12 = cArr[i16];
            try {
                Object[] objArr2 = new Object[3];
                objArr2[c11] = gettransactionstatus;
                objArr2[1] = gettransactionstatus;
                objArr2[i14] = Integer.valueOf(c12);
                Map map = getMessageVersion.timedout;
                Object obj = map.get(962978490);
                if (obj != null) {
                    method = obj;
                    i12 = i14;
                } else {
                    Class cls = (Class) getMessageVersion.getSDKTransactionID(690 - (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), (char) ((TypedValue.complexToFloat(i14) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(i14) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 16022), 33 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)));
                    byte b11 = (byte) i14;
                    byte b12 = b11;
                    i12 = i14;
                    Object[] objArr3 = new Object[1];
                    b(b11, b12, (byte) (b12 - 1), objArr3);
                    method = cls.getMethod((String) objArr3[i12], Integer.TYPE, Object.class, Object.class);
                    map.put(962978490, method);
                }
                jArr[i16] = ((Long) ((Method) method).invoke(null, objArr2)).longValue() ^ (getTransactionStatus ^ (-2227742522694838850L));
                Object[] objArr4 = new Object[2];
                objArr4[1] = gettransactionstatus;
                objArr4[i12] = gettransactionstatus;
                Object method2 = map.get(-46730980);
                if (method2 == null) {
                    int i17 = i12;
                    method2 = ((Class) getMessageVersion.getSDKTransactionID(417 - Color.blue(i12), (char) (29016 - TextUtils.lastIndexOf("", '0', i17, i17)), TextUtils.lastIndexOf("", '0', i17, i17) + 25)).getMethod("A", Object.class, Object.class);
                    map.put(-46730980, method2);
                }
                ((Method) method2).invoke(null, objArr4);
                jArr = jArr;
                c11 = 2;
                i14 = 0;
            } catch (Throwable th2) {
                cause = th2.getCause();
                if (cause != null) {
                    throw th2;
                }
                throw cause;
            }
            cause = th2.getCause();
            if (cause != null) {
                throw th2;
            }
            throw cause;
        }
        long[] jArr2 = jArr;
        char[] cArr2 = new char[length];
        gettransactionstatus.getSDKTransactionID = 0;
        $11 = ($10 + 119) % 128;
        while (true) {
            int i18 = gettransactionstatus.getSDKTransactionID;
            if (i18 >= cArr.length) {
                objArr[0] = new String(cArr2);
                return;
            }
            cArr2[i18] = (char) jArr2[i18];
            Object[] objArr5 = {gettransactionstatus, gettransactionstatus};
            Map map2 = getMessageVersion.timedout;
            Object method3 = map2.get(-46730980);
            if (method3 == null) {
                method3 = ((Class) getMessageVersion.getSDKTransactionID((AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 417, (char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 29017), ((Process.getThreadPriority(0) + 20) >> 6) + 24)).getMethod("A", Object.class, Object.class);
                map2.put(-46730980, method3);
            }
            ((Method) method3).invoke(null, objArr5);
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002a  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002a
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void b(short r5, short r6, byte r7, java.lang.Object[] r8) {
        /*
            byte[] r0 = atd.at.getDeviceData.$$a
            int r7 = r7 + 4
            int r5 = r5 * 4
            int r1 = 1 - r5
            int r6 = r6 * 4
            int r6 = 118 - r6
            byte[] r1 = new byte[r1]
            r2 = 0
            int r5 = 0 - r5
            if (r0 != 0) goto L17
            r4 = r5
            r6 = r7
            r3 = r2
            goto L2e
        L17:
            r3 = r7
            r7 = r6
            r6 = r3
            r3 = r2
        L1b:
            byte r4 = (byte) r7
            int r6 = r6 + 1
            r1[r3] = r4
            if (r3 != r5) goto L2a
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L2a:
            int r3 = r3 + 1
            r4 = r0[r6]
        L2e:
            int r7 = r7 + r4
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.at.getDeviceData.b(short, short, byte, java.lang.Object[]):void");
    }

    private static void dk_(TextView textView, CharSequence charSequence) {
        ChallengeResultTimeout = (ChallengeResultError + 111) % 128;
        if (TextUtils.isEmpty(charSequence)) {
            ChallengeResultError = (ChallengeResultTimeout + 77) % 128;
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            textView.setText(charSequence);
        }
    }

    public static /* synthetic */ Object getSDKReferenceNumber(Object[] objArr, int i11, int i12, int i13) {
        atd.av.getSDKTransactionID getsdktransactionid = (atd.av.getSDKTransactionID) objArr[0];
        String str = (String) objArr[1];
        String str2 = (String) objArr[2];
        if (!TextUtils.isEmpty(str)) {
            ChallengeResultTimeout = (ChallengeResultError + 33) % 128;
            if (!TextUtils.isEmpty(str2)) {
                getsdktransactionid.setTitle(str);
                getsdktransactionid.setInfo(str2);
                ChallengeResultError = (ChallengeResultTimeout + 103) % 128;
                return null;
            }
        }
        getsdktransactionid.setVisibility(8);
        return null;
    }

    static void init$0() {
        $$a = new byte[]{107, 31, -31, -112};
        $$b = 200;
    }

    protected final void getDeviceData() {
        int i11 = ChallengeResultError + 121;
        ChallengeResultTimeout = i11 % 128;
        int i12 = i11 % 2;
        getSDKReferenceNumber(this.getSDKAppID, false);
        int i13 = ChallengeResultError + 21;
        ChallengeResultTimeout = i13 % 128;
        if (i13 % 2 != 0) {
            int i14 = 42 / 0;
        }
    }

    protected String getMessageVersion() throws Throwable {
        Object obj;
        int i11 = ChallengeResultError + 29;
        ChallengeResultTimeout = i11 % 128;
        if (i11 % 2 != 0) {
            this.ChallengeResultCompleted.getVisibility();
            throw null;
        }
        if (this.ChallengeResultCompleted.getVisibility() != 0) {
            ChallengeResultTimeout = (ChallengeResultError + 59) % 128;
            return null;
        }
        if (this.ChallengeResultCompleted.isChecked()) {
            Object[] objArr = new Object[1];
            a("긞", (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 63823, objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            a("급", ((byte) KeyEvent.getModifierMetaStateMask()) + 52454, objArr2);
            obj = objArr2[0];
        }
        return ((String) obj).intern();
    }

    protected abstract int getSDKAppID();

    public void getSDKAppID(C c11) {
        ChallengeResultTimeout = (ChallengeResultError + 29) % 128;
        dk_(this.getSDKReferenceNumber, c11.AuthenticationRequestParameters());
        dk_(this.getSDKTransactionID, c11.getSDKReferenceNumber());
        dk_(this.getDeviceData, (String) getAdditionalDetails.getSDKAppID(new Object[]{c11}, -433727603, 433727603, System.identityHashCode(c11)));
        getSDKReferenceNumber(this.getSDKAppID, c11.ChallengeResultError());
        if (c11.getDeviceData() == atd.i.getSDKAppID.SINGLE_TEXT_INPUT) {
            ChallengeResultTimeout = (ChallengeResultError + 11) % 128;
            dk_(this.AuthenticationRequestParameters, (String) getAdditionalDetails.getSDKAppID(new Object[]{c11}, -364749472, 364749473, System.identityHashCode(c11)));
            ChallengeResultTimeout = (ChallengeResultError + 7) % 128;
        } else {
            this.AuthenticationRequestParameters.setVisibility(8);
        }
        getSDKReferenceNumber(new Object[]{this.BuildConfig, c11.ChallengeResultCancelled(), c11.getMessageVersion()}, 1730968334, -1730968334, (int) System.currentTimeMillis());
        getSDKReferenceNumber(new Object[]{this.ChallengeResultCancelled, c11.ChallengeResult(), c11.ChallengeResultCompleted()}, 1730968334, -1730968334, (int) System.currentTimeMillis());
        getSDKReferenceNumber(c11);
        getDeviceData(c11);
        this.AuthenticationRequestParameters.setOnClickListener(this);
        getSDKTransactionID(c11);
    }

    @Override // atd.at.AuthenticationRequestParameters
    protected final int getSDKTransactionID() {
        int i11 = ChallengeResultTimeout + 83;
        ChallengeResultError = i11 % 128;
        if (i11 % 2 != 0) {
            return R.layout.a3ds2_view_challenge_native_container;
        }
        throw null;
    }

    protected abstract void getSDKTransactionID(C c11);

    /* JADX WARN: Code duplicated, block: B:11:0x002f  */
    public void onClick(View view) {
        ChallengeResultError = (ChallengeResultTimeout + 93) % 128;
        if (getSDKReferenceNumber() != null) {
            int i11 = ChallengeResultError + 119;
            ChallengeResultTimeout = i11 % 128;
            if (i11 % 2 != 0) {
                int i12 = 65 / 0;
                if (view.equals(this.AuthenticationRequestParameters)) {
                    this.AuthenticationRequestParameters.setEnabled(false);
                    getSDKReferenceNumber().getSDKReferenceNumber(getMessageVersion());
                }
            } else if (view.equals(this.AuthenticationRequestParameters)) {
                this.AuthenticationRequestParameters.setEnabled(false);
                getSDKReferenceNumber().getSDKReferenceNumber(getMessageVersion());
            }
        }
        int i13 = ChallengeResultError + 123;
        ChallengeResultTimeout = i13 % 128;
        if (i13 % 2 != 0) {
            throw null;
        }
    }

    protected final void getSDKTransactionID(CharSequence charSequence) {
        ChallengeResultTimeout = (ChallengeResultError + 27) % 128;
        dk_(this.getSDKTransactionID, charSequence);
        int i11 = ChallengeResultTimeout + 109;
        ChallengeResultError = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    @SuppressLint({"SyntheticAccessor"})
    private void getDeviceData(C c11) {
        boolean z11;
        ChallengeResultTimeout = (ChallengeResultError + 69) % 128;
        SwitchCompat switchCompat = this.ChallengeResultCompleted;
        if (TextUtils.isEmpty(c11.ChallengeResultTimeout())) {
            z11 = false;
        } else {
            ChallengeResultError = (ChallengeResultTimeout + 81) % 128;
            z11 = true;
        }
        getSDKReferenceNumber(switchCompat, z11);
        this.ChallengeResultCompleted.setText(c11.ChallengeResultTimeout());
    }

    protected final void getSDKReferenceNumber(int i11) {
        int i12 = ChallengeResultError + 47;
        ChallengeResultTimeout = i12 % 128;
        if (i12 % 2 == 0 || Build.VERSION.SDK_INT >= 94) {
            this.getDeviceData.setLabelFor(i11);
            ChallengeResultError = (ChallengeResultTimeout + 87) % 128;
        }
        ChallengeResultTimeout = (ChallengeResultError + 65) % 128;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0036  */
    /* JADX WARN: Code duplicated, block: B:13:0x0046  */
    /* JADX WARN: Code duplicated, block: B:14:0x004f  */
    /* JADX WARN: Code duplicated, block: B:7:0x002a  */
    /* JADX WARN: Code duplicated, block: B:9:0x0034  */
    private void getSDKReferenceNumber(C c11) {
        boolean z11;
        ImageView imageView;
        ChallengeResultError = (ChallengeResultTimeout + 29) % 128;
        atd.e.ChallengeResultCancelled transactionStatus = c11.getTransactionStatus();
        atd.e.ChallengeResultCancelled additionalDetails = c11.getAdditionalDetails();
        boolean z12 = true;
        if (transactionStatus != null) {
            ChallengeResultTimeout = (ChallengeResultError + 75) % 128;
            if (additionalDetails != null) {
                getSDKReferenceNumber(this.getSDKEphemeralPublicKey, true);
                getSDKReferenceNumber(this.ChallengeResult, true);
                imageView = this.getMessageVersion;
            } else {
                getSDKReferenceNumber(this.getSDKEphemeralPublicKey, false);
                ImageView imageView2 = this.ChallengeResult;
                if (transactionStatus != null) {
                    z11 = true;
                } else {
                    ChallengeResultError = (ChallengeResultTimeout + 107) % 128;
                    z11 = false;
                }
                getSDKReferenceNumber(imageView2, z11);
                imageView = this.getMessageVersion;
                if (additionalDetails != null) {
                    ChallengeResultError = (ChallengeResultTimeout + 109) % 128;
                } else {
                    z12 = false;
                }
            }
        } else {
            getSDKReferenceNumber(this.getSDKEphemeralPublicKey, false);
            ImageView imageView3 = this.ChallengeResult;
            if (transactionStatus != null) {
                z11 = true;
            } else {
                ChallengeResultError = (ChallengeResultTimeout + 107) % 128;
                z11 = false;
            }
            getSDKReferenceNumber(imageView3, z11);
            imageView = this.getMessageVersion;
            if (additionalDetails != null) {
                ChallengeResultError = (ChallengeResultTimeout + 109) % 128;
            } else {
                z12 = false;
            }
        }
        getSDKReferenceNumber(imageView, z12);
        atd.d.getSDKEphemeralPublicKey getsdkephemeralpublickey = atd.d.getSDKEphemeralPublicKey.getSDKAppID;
        atd.d.getSDKEphemeralPublicKey.getSDKReferenceNumber(new Object[]{getsdkephemeralpublickey, this.ChallengeResult, transactionStatus}, 2049407921, -2049407915, System.identityHashCode(getsdkephemeralpublickey));
        atd.d.getSDKEphemeralPublicKey.getSDKReferenceNumber(new Object[]{getsdkephemeralpublickey, this.getMessageVersion, additionalDetails}, 2049407921, -2049407915, System.identityHashCode(getsdkephemeralpublickey));
    }

    private static void getSDKAppID(atd.av.getSDKTransactionID getsdktransactionid, String str, String str2) {
        getSDKReferenceNumber(new Object[]{getsdktransactionid, str, str2}, 1730968334, -1730968334, (int) System.currentTimeMillis());
    }

    private static void getSDKReferenceNumber(View view, boolean z11) {
        int i11;
        if (view != null) {
            if (z11) {
                ChallengeResultTimeout = (ChallengeResultError + 43) % 128;
                i11 = 0;
            } else {
                i11 = 8;
            }
            view.setVisibility(i11);
        }
        ChallengeResultTimeout = (ChallengeResultError + 123) % 128;
    }
}
