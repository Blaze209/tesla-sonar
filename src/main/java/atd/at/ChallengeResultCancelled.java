package atd.at;

import android.content.Context;
import android.media.AudioTrack;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import atd.a.getMessageVersion;
import atd.az.getAdditionalDetails;
import atd.e.ChallengeResultCompleted;
import atd.e.ChallengeResultError;
import atd.e.getTransactionStatus;
import com.adyen.threeds2.R;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.vending.expansion.downloader.impl.DownloaderService;
import com.plaid.internal.EnumC4419g;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class ChallengeResultCancelled extends atd.at.getDeviceData<getTransactionStatus, atd.ax.getSDKTransactionID> implements View.OnClickListener {
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10;
    private static int $11;
    private static int AuthenticationRequestParameters;
    private static int getSDKEphemeralPublicKey;
    private static long getSDKReferenceNumber;
    private final Button getDeviceData;
    private final ListView getSDKAppID;
    private final Set<ChallengeResultCompleted> getSDKTransactionID;

    /* JADX INFO: renamed from: atd.at.ChallengeResultCancelled$4, reason: invalid class name */
    static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] AuthenticationRequestParameters;
        private static int getDeviceData = 0;
        private static int getSDKAppID = 1;

        static {
            int[] iArr = new int[atd.i.getSDKAppID.values().length];
            AuthenticationRequestParameters = iArr;
            try {
                iArr[atd.i.getSDKAppID.SINGLE_SELECT.ordinal()] = 1;
                int i11 = getDeviceData;
                int i12 = i11 & 97;
                getSDKAppID = ((i12 - (~((i11 ^ 97) | i12))) - 1) % 128;
            } catch (NoSuchFieldError unused) {
            }
            try {
                AuthenticationRequestParameters[atd.i.getSDKAppID.MULTI_SELECT.ordinal()] = 2;
                int i13 = getSDKAppID;
                int i14 = i13 & 87;
                int i15 = i13 | 87;
                int i16 = (i14 ^ i15) + ((i15 & i14) << 1);
                getDeviceData = i16 % 128;
                if (i16 % 2 != 0) {
                    int i17 = 65 / 0;
                }
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    abstract class AuthenticationRequestParameters implements View.OnClickListener, CompoundButton.OnCheckedChangeListener {
        private static int ChallengeResultCancelled = 1;
        private static int getSDKAppID;
        final View AuthenticationRequestParameters;
        final CompoundButton getDeviceData;
        private TextView getSDKTransactionID;

        AuthenticationRequestParameters(View view) {
            this.AuthenticationRequestParameters = view;
            view.setOnClickListener(this);
            this.getSDKTransactionID = (TextView) view.findViewById(R.id.textView_value);
            CompoundButton compoundButton = (CompoundButton) view.findViewById(R.id.checkBox_selected);
            this.getDeviceData = compoundButton;
            compoundButton.setOnCheckedChangeListener(this);
        }

        private static /* synthetic */ Object getSDKReferenceNumber(Object[] objArr) {
            AuthenticationRequestParameters authenticationRequestParameters = (AuthenticationRequestParameters) objArr[0];
            ChallengeResultCompleted challengeResultCompleted = (ChallengeResultCompleted) objArr[1];
            int i11 = getSDKAppID;
            int i12 = ((i11 & 20) + (i11 | 20)) - 1;
            ChallengeResultCancelled = i12 % 128;
            if (i12 % 2 == 0) {
                authenticationRequestParameters.getSDKTransactionID.setText((String) ChallengeResultCompleted.AuthenticationRequestParameters(new Object[]{challengeResultCompleted}, 1815332088, -1815332085, System.identityHashCode(challengeResultCompleted)));
                authenticationRequestParameters.getDeviceData.setTag(challengeResultCompleted);
                authenticationRequestParameters.getDeviceData.setChecked(ChallengeResultCancelled.this.getDeviceData(challengeResultCompleted));
                int i13 = 35 / 0;
            } else {
                authenticationRequestParameters.getSDKTransactionID.setText((String) ChallengeResultCompleted.AuthenticationRequestParameters(new Object[]{challengeResultCompleted}, 1815332088, -1815332085, System.identityHashCode(challengeResultCompleted)));
                authenticationRequestParameters.getDeviceData.setTag(challengeResultCompleted);
                authenticationRequestParameters.getDeviceData.setChecked(ChallengeResultCancelled.this.getDeviceData(challengeResultCompleted));
            }
            int i14 = ChallengeResultCancelled;
            int i15 = i14 & 27;
            int i16 = (i14 ^ 27) | i15;
            getSDKAppID = (((i15 | i16) << 1) - (i16 ^ i15)) % 128;
            return null;
        }

        public static /* synthetic */ Object getSDKTransactionID(Object[] objArr, int i11, int i12, int i13) {
            return getSDKReferenceNumber(objArr);
        }

        final void getSDKTransactionID(ChallengeResultCompleted challengeResultCompleted) {
            getSDKTransactionID(new Object[]{this, challengeResultCompleted}, 836659574, -836659574, System.identityHashCode(this));
        }
    }

    abstract class getSDKAppID extends BaseAdapter {
        private static int getDeviceData = 0;
        private static int getSDKAppID = 1;
        private final List<ChallengeResultCompleted> getSDKReferenceNumber;

        getSDKAppID(List<ChallengeResultCompleted> list) {
            this.getSDKReferenceNumber = list;
        }

        public static /* synthetic */ Object AuthenticationRequestParameters(Object[] objArr, int i11, int i12, int i13) {
            return getSDKTransactionID(objArr);
        }

        private static /* synthetic */ Object getSDKTransactionID(Object[] objArr) {
            getSDKAppID getsdkappid = (getSDKAppID) objArr[0];
            int iIntValue = ((Number) objArr[1]).intValue();
            int i11 = getSDKAppID;
            int i12 = ((i11 & (-16)) | ((~i11) & 15)) + ((i11 & 15) << 1);
            getDeviceData = i12 % 128;
            int i13 = i12 % 2;
            ChallengeResultCompleted challengeResultCompleted = getsdkappid.getSDKReferenceNumber.get(iIntValue);
            if (i13 != 0) {
                throw null;
            }
            int i14 = getDeviceData + 79;
            getSDKAppID = i14 % 128;
            if (i14 % 2 != 0) {
                return challengeResultCompleted;
            }
            throw null;
        }

        abstract AuthenticationRequestParameters dn_(ViewGroup viewGroup);

        @Override // android.widget.Adapter
        public int getCount() {
            getDeviceData = (getSDKAppID + 103) % 128;
            int size = this.getSDKReferenceNumber.size();
            int i11 = getSDKAppID;
            int i12 = i11 & 85;
            getDeviceData = ((i12 - (~((i11 ^ 85) | i12))) - 1) % 128;
            return size;
        }

        @Override // android.widget.Adapter
        public /* synthetic */ Object getItem(int i11) {
            int i12 = getDeviceData;
            int i13 = ((i12 | 64) << 1) - (i12 ^ 64);
            int i14 = (i13 ^ (-1)) + (i13 << 1);
            getSDKAppID = i14 % 128;
            if (i14 % 2 != 0) {
                return (ChallengeResultCompleted) AuthenticationRequestParameters(new Object[]{this, Integer.valueOf(i11)}, -947232322, 947232322, i11);
            }
            int i15 = 40 / 0;
            return (ChallengeResultCompleted) AuthenticationRequestParameters(new Object[]{this, Integer.valueOf(i11)}, -947232322, 947232322, i11);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i11) {
            int i12 = getSDKAppID;
            long j11 = i11;
            int i13 = i12 ^ 79;
            int i14 = (i12 & 79) << 1;
            int i15 = ((i13 | i14) << 1) - (i13 ^ i14);
            getDeviceData = i15 % 128;
            if (i15 % 2 == 0) {
                return j11;
            }
            throw null;
        }

        @Override // android.widget.Adapter
        public View getView(int i11, View view, ViewGroup viewGroup) {
            getDeviceData = (getSDKAppID + 107) % 128;
            AuthenticationRequestParameters authenticationRequestParametersDn_ = dn_(viewGroup);
            AuthenticationRequestParameters.getSDKTransactionID(new Object[]{authenticationRequestParametersDn_, (ChallengeResultCompleted) AuthenticationRequestParameters(new Object[]{this, Integer.valueOf(i11)}, -947232322, 947232322, i11)}, 836659574, -836659574, System.identityHashCode(authenticationRequestParametersDn_));
            View view2 = authenticationRequestParametersDn_.AuthenticationRequestParameters;
            getSDKAppID = (getDeviceData + 23) % 128;
            return view2;
        }

        private ChallengeResultCompleted AuthenticationRequestParameters(int i11) {
            return (ChallengeResultCompleted) AuthenticationRequestParameters(new Object[]{this, Integer.valueOf(i11)}, -947232322, 947232322, i11);
        }
    }

    final class getSDKTransactionID extends AuthenticationRequestParameters {
        private static int getSDKReferenceNumber = 1;
        private static int getSDKTransactionID;

        getSDKTransactionID(View view) {
            super(view);
        }

        public static /* synthetic */ Object AuthenticationRequestParameters(Object[] objArr, int i11, int i12, int i13) {
            int i14 = ~i12;
            int i15 = i14 | i11;
            return ((((i11 * 624) + (i12 * (-622))) + ((~(i15 | i13)) * 623)) + (((~(i12 | (~i11))) | (~i13)) * (-623))) + (((~(i11 | i13)) | ((~i15) | (~(i14 | i13)))) * 623) != 1 ? getSDKTransactionID(objArr) : getSDKAppID(objArr);
        }

        private static /* synthetic */ Object getSDKAppID(Object[] objArr) {
            getSDKTransactionID getsdktransactionid = (getSDKTransactionID) objArr[0];
            CompoundButton compoundButton = (CompoundButton) objArr[1];
            boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
            int i11 = getSDKReferenceNumber;
            int i12 = (i11 | 123) << 1;
            int i13 = -(i11 ^ 123);
            int i14 = (i12 ^ i13) + ((i13 & i12) << 1);
            getSDKTransactionID = i14 % 128;
            if (i14 % 2 != 0) {
                throw null;
            }
            ChallengeResultCompleted challengeResultCompleted = (ChallengeResultCompleted) compoundButton.getTag();
            if (!zBooleanValue) {
                ChallengeResultCancelled challengeResultCancelled = ChallengeResultCancelled.this;
                ChallengeResultCancelled.getSDKTransactionID(new Object[]{challengeResultCancelled, challengeResultCompleted}, -458375322, 458375323, System.identityHashCode(challengeResultCancelled));
                int i15 = getSDKTransactionID;
                getSDKReferenceNumber = (((i15 ^ 62) + ((i15 & 62) << 1)) - 1) % 128;
                return null;
            }
            ChallengeResultCancelled.this.getSDKReferenceNumber(challengeResultCompleted);
            int i16 = getSDKReferenceNumber + 39;
            getSDKTransactionID = i16 % 128;
            if (i16 % 2 == 0) {
                return null;
            }
            throw null;
        }

        private static /* synthetic */ Object getSDKTransactionID(Object[] objArr) {
            boolean z11 = false;
            getSDKTransactionID getsdktransactionid = (getSDKTransactionID) objArr[0];
            int i11 = getSDKTransactionID;
            int i12 = (i11 ^ 49) + ((i11 & 49) << 1);
            getSDKReferenceNumber = i12 % 128;
            if (i12 % 2 == 0) {
                getsdktransactionid.getDeviceData.isChecked();
                throw null;
            }
            CompoundButton compoundButton = getsdktransactionid.getDeviceData;
            if (compoundButton.isChecked()) {
                int i13 = getSDKReferenceNumber;
                int i14 = (i13 & (-78)) | ((~i13) & 77);
                int i15 = (i13 & 77) << 1;
                getSDKTransactionID = ((i14 & i15) + (i15 | i14)) % 128;
            } else {
                int i16 = (getSDKTransactionID + 91) % 128;
                getSDKReferenceNumber = i16;
                int i17 = i16 & 91;
                getSDKTransactionID = ((((i16 | 91) & (~i17)) - (~(-(-(i17 << 1))))) - 1) % 128;
                z11 = true;
            }
            compoundButton.setChecked(z11);
            int i18 = getSDKTransactionID;
            int i19 = ((i18 & 118) + (i18 | 118)) - 1;
            getSDKReferenceNumber = i19 % 128;
            if (i19 % 2 != 0) {
                return null;
            }
            throw null;
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
            AuthenticationRequestParameters(new Object[]{this, compoundButton, Boolean.valueOf(z11)}, -594476802, 594476803, System.identityHashCode(this));
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            AuthenticationRequestParameters(new Object[]{this, view}, 1064218166, -1064218166, System.identityHashCode(this));
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        AuthenticationRequestParameters = 0;
        getSDKEphemeralPublicKey = 1;
        getSDKReferenceNumber = -6038113750840933730L;
    }

    public ChallengeResultCancelled(Context context) {
        this(context, null);
    }

    @NonNull
    private static List<String> AuthenticationRequestParameters(Set<ChallengeResultCompleted> set) {
        ArrayList arrayList = new ArrayList();
        Iterator<ChallengeResultCompleted> it = set.iterator();
        while (it.hasNext()) {
            int i11 = AuthenticationRequestParameters + 7;
            getSDKEphemeralPublicKey = i11 % 128;
            if (i11 % 2 == 0) {
                ChallengeResultCompleted next = it.next();
                arrayList.add((String) ChallengeResultCompleted.AuthenticationRequestParameters(new Object[]{next}, 1536326450, -1536326444, System.identityHashCode(next)));
                int i12 = 18 / 0;
            } else {
                ChallengeResultCompleted next2 = it.next();
                arrayList.add((String) ChallengeResultCompleted.AuthenticationRequestParameters(new Object[]{next2}, 1536326450, -1536326444, System.identityHashCode(next2)));
            }
        }
        int i13 = AuthenticationRequestParameters + 75;
        getSDKEphemeralPublicKey = i13 % 128;
        if (i13 % 2 == 0) {
            int i14 = 18 / 0;
        }
        return arrayList;
    }

    private static void c(String str, int i11, Object[] objArr) throws Throwable {
        int i12 = $10 + 51;
        $11 = i12 % 128;
        if (i12 % 2 == 0) {
            throw null;
        }
        char[] charArray = str != null ? str.toCharArray() : str;
        getAdditionalDetails getadditionaldetails = new getAdditionalDetails();
        char[] deviceData = getAdditionalDetails.getDeviceData(getSDKReferenceNumber ^ 4326518537449951405L, charArray, i11);
        int i13 = 4;
        getadditionaldetails.getDeviceData = 4;
        $10 = ($11 + 53) % 128;
        while (true) {
            int i14 = getadditionaldetails.getDeviceData;
            if (i14 >= deviceData.length) {
                objArr[0] = new String(deviceData, i13, deviceData.length - 4);
                return;
            }
            int i15 = i14 - 4;
            getadditionaldetails.getSDKTransactionID = i15;
            try {
                Object[] objArr2 = {Long.valueOf(deviceData[i14] ^ deviceData[i14 % 4]), Long.valueOf(i15), Long.valueOf(getSDKReferenceNumber)};
                Map map = getMessageVersion.timedout;
                Object method = map.get(-1024136788);
                if (method == null) {
                    Class cls = (Class) getMessageVersion.getSDKTransactionID((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 2749, (char) (54838 - KeyEvent.keyCodeFromString("")), KeyEvent.keyCodeFromString("") + 29);
                    Class cls2 = Long.TYPE;
                    method = cls.getMethod("c", cls2, cls2, cls2);
                    map.put(-1024136788, method);
                }
                deviceData[i14] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {getadditionaldetails, getadditionaldetails};
                Object method2 = map.get(-719904898);
                if (method2 == null) {
                    Class cls3 = (Class) getMessageVersion.getSDKTransactionID(TextUtils.lastIndexOf("", '0', 0) + 1402, (char) ((KeyEvent.getMaxKeyCode() >> 16) + 16690), (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 21);
                    byte b11 = (byte) 0;
                    byte b12 = b11;
                    Object[] objArr4 = new Object[1];
                    d(b11, b12, (byte) (b12 - 1), objArr4);
                    method2 = cls3.getMethod((String) objArr4[0], Object.class, Object.class);
                    map.put(-719904898, method2);
                }
                ((Method) method2).invoke(null, objArr3);
                i13 = i13;
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause == null) {
                    throw th2;
                }
                throw cause;
            }
        }
    }

    private static void d(byte b11, int i11, int i12, Object[] objArr) {
        int i13 = i11 * 4;
        int i14 = 101 - (b11 * 4);
        int i15 = i12 + 4;
        byte[] bArr = $$d;
        byte[] bArr2 = new byte[i13 + 1];
        int i16 = -1;
        if (bArr == null) {
            i14 = (-i14) + i15;
            i15 = i15;
            bArr = bArr;
            i16 = -1;
        }
        while (true) {
            int i17 = i16 + 1;
            bArr2[i17] = (byte) i14;
            if (i17 == i13) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            int i18 = i15 + 1;
            i14 = (-bArr[i18]) + i14;
            i15 = i18;
            bArr = bArr;
            i16 = i17;
        }
    }

    public static /* synthetic */ Object getSDKTransactionID(Object[] objArr, int i11, int i12, int i13) {
        int i14 = ~i11;
        int i15 = ~i12;
        int i16 = (i11 * (-209)) + (i12 * (-209)) + ((~(i14 | i15)) * EnumC4419g.SDK_ASSET_ICON_NEW_WINDOW_VALUE);
        int i17 = ~i13;
        int i18 = i16 + (((~(i15 | i17)) | (~(i14 | i13))) * EnumC4419g.SDK_ASSET_ICON_NEW_WINDOW_VALUE) + (((~(i11 | i15 | i13)) | (~(i12 | i14 | i17))) * EnumC4419g.SDK_ASSET_ICON_NEW_WINDOW_VALUE);
        if (i18 == 1) {
            return getSDKAppID(objArr);
        }
        if (i18 == 2) {
            ChallengeResultCancelled challengeResultCancelled = (ChallengeResultCancelled) objArr[0];
            List<ChallengeResultCompleted> listChallengeResultKt = ((getTransactionStatus) objArr[1]).ChallengeResultKt();
            challengeResultCancelled.ChallengeResult();
            challengeResultCancelled.getSDKAppID.setAdapter((ListAdapter) new getSDKAppID(listChallengeResultKt) { // from class: atd.at.ChallengeResultCancelled.2
                private static int AuthenticationRequestParameters = 1;
                private static int getDeviceData;

                public static /* synthetic */ Object getSDKAppID(Object[] objArr2, int i19, int i21, int i22) {
                    AnonymousClass2 anonymousClass2 = (AnonymousClass2) objArr2[0];
                    ViewGroup viewGroup = (ViewGroup) objArr2[1];
                    getSDKTransactionID getsdktransactionid = ChallengeResultCancelled.this.new getSDKTransactionID(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.a3ds2_view_multi_select_item, viewGroup, false));
                    int i23 = getDeviceData;
                    int i24 = i23 & 61;
                    int i25 = -(-(i23 | 61));
                    AuthenticationRequestParameters = (((i24 | i25) << 1) - (i25 ^ i24)) % 128;
                    return getsdktransactionid;
                }

                @Override // atd.at.ChallengeResultCancelled.getSDKAppID
                final AuthenticationRequestParameters dn_(ViewGroup viewGroup) {
                    return (AuthenticationRequestParameters) getSDKAppID(new Object[]{this, viewGroup}, -1299174279, 1299174279, System.identityHashCode(this));
                }
            });
            AuthenticationRequestParameters = (getSDKEphemeralPublicKey + 85) % 128;
            return null;
        }
        ChallengeResultCancelled challengeResultCancelled2 = (ChallengeResultCancelled) objArr[0];
        AuthenticationRequestParameters = (getSDKEphemeralPublicKey + 111) % 128;
        int i19 = 0;
        while (i19 < challengeResultCancelled2.getSDKAppID.getChildCount()) {
            CompoundButton compoundButton = (CompoundButton) ((ViewGroup) challengeResultCancelled2.getSDKAppID.getChildAt(i19)).findViewById(R.id.checkBox_selected);
            if (compoundButton.isChecked()) {
                getSDKEphemeralPublicKey = (AuthenticationRequestParameters + 83) % 128;
                compoundButton.setChecked(false);
            }
            i19++;
            AuthenticationRequestParameters = (getSDKEphemeralPublicKey + 5) % 128;
        }
        return null;
    }

    static void init$0() {
        $$d = new byte[]{81, 113, 124, -104};
        $$e = 46;
    }

    final void BuildConfig() {
        getSDKTransactionID(new Object[]{this}, 1510869211, -1510869211, System.identityHashCode(this));
    }

    final void ChallengeResult() {
        int i11 = AuthenticationRequestParameters + 31;
        getSDKEphemeralPublicKey = i11 % 128;
        if (i11 % 2 != 0) {
            this.getSDKTransactionID.clear();
        } else {
            this.getSDKTransactionID.clear();
            int i12 = 84 / 0;
        }
    }

    final boolean getDeviceData(ChallengeResultCompleted challengeResultCompleted) {
        boolean zContains;
        int i11 = AuthenticationRequestParameters + 111;
        getSDKEphemeralPublicKey = i11 % 128;
        if (i11 % 2 == 0) {
            zContains = this.getSDKTransactionID.contains(challengeResultCompleted);
            int i12 = 11 / 0;
        } else {
            zContains = this.getSDKTransactionID.contains(challengeResultCompleted);
        }
        AuthenticationRequestParameters = (getSDKEphemeralPublicKey + 71) % 128;
        return zContains;
    }

    @Override // atd.at.getDeviceData
    public final /* synthetic */ void getSDKAppID(atd.e.getAdditionalDetails getadditionaldetails) {
        int i11 = AuthenticationRequestParameters + 15;
        getSDKEphemeralPublicKey = i11 % 128;
        int i12 = i11 % 2;
        super.getSDKAppID(getadditionaldetails);
        if (i12 == 0) {
            throw null;
        }
        int i13 = AuthenticationRequestParameters + 47;
        getSDKEphemeralPublicKey = i13 % 128;
        if (i13 % 2 == 0) {
            int i14 = 84 / 0;
        }
    }

    final void getSDKReferenceNumber(ChallengeResultCompleted challengeResultCompleted) {
        int i11 = getSDKEphemeralPublicKey + 19;
        AuthenticationRequestParameters = i11 % 128;
        if (i11 % 2 != 0) {
            this.getSDKTransactionID.add(challengeResultCompleted);
            throw null;
        }
        this.getSDKTransactionID.add(challengeResultCompleted);
        AuthenticationRequestParameters = (getSDKEphemeralPublicKey + 17) % 128;
    }

    @Override // atd.at.getDeviceData, android.view.View.OnClickListener
    public final void onClick(View view) {
        getSDKEphemeralPublicKey = (AuthenticationRequestParameters + 1) % 128;
        super.onClick(view);
        if (getSDKReferenceNumber() != 0 && view.equals(this.getDeviceData)) {
            this.getDeviceData.setEnabled(false);
            List<String> listAuthenticationRequestParameters = AuthenticationRequestParameters(this.getSDKTransactionID);
            if (listAuthenticationRequestParameters.isEmpty()) {
                getSDKEphemeralPublicKey = (AuthenticationRequestParameters + 69) % 128;
                ((atd.ax.getSDKTransactionID) getSDKReferenceNumber()).getSDKTransactionID(getMessageVersion());
                return;
            }
            ((atd.ax.getSDKTransactionID) getSDKReferenceNumber()).getSDKReferenceNumber(listAuthenticationRequestParameters, getMessageVersion());
        }
        AuthenticationRequestParameters = (getSDKEphemeralPublicKey + 51) % 128;
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        int i11 = getSDKEphemeralPublicKey + 111;
        AuthenticationRequestParameters = i11 % 128;
        if (i11 % 2 != 0) {
            getSDKReferenceNumber((getSDKReferenceNumber) parcelable);
            super.onRestoreInstanceState(parcelable);
            int i12 = 27 / 0;
        } else {
            getSDKReferenceNumber((getSDKReferenceNumber) parcelable);
            super.onRestoreInstanceState(parcelable);
        }
        int i13 = AuthenticationRequestParameters + 33;
        getSDKEphemeralPublicKey = i13 % 128;
        if (i13 % 2 == 0) {
            throw null;
        }
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        getSDKReferenceNumber getsdkreferencenumber = new getSDKReferenceNumber(super.onSaveInstanceState());
        getSDKReferenceNumber.AuthenticationRequestParameters(new Object[]{getsdkreferencenumber, this.getSDKTransactionID}, -1781622911, 1781622913, System.identityHashCode(getsdkreferencenumber));
        int i11 = AuthenticationRequestParameters + 63;
        getSDKEphemeralPublicKey = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 37 / 0;
        }
        return getsdkreferencenumber;
    }

    static final class getSDKReferenceNumber extends View.BaseSavedState {
        public static final Parcelable.Creator<getSDKReferenceNumber> CREATOR = new Parcelable.Creator<getSDKReferenceNumber>() { // from class: atd.at.ChallengeResultCancelled.getSDKReferenceNumber.5
            private static int AuthenticationRequestParameters = 1;
            private static int getSDKAppID;

            private static getSDKReferenceNumber do_(Parcel parcel) {
                return (getSDKReferenceNumber) getSDKReferenceNumber(new Object[]{parcel}, -602669195, 602669195, (int) System.currentTimeMillis());
            }

            private static /* synthetic */ Object getDeviceData(Object[] objArr) {
                AnonymousClass5 anonymousClass5 = (AnonymousClass5) objArr[0];
                Parcel parcel = (Parcel) objArr[1];
                int iIdentityHashCode = System.identityHashCode(anonymousClass5);
                int i11 = (iIdentityHashCode ^ 647782500) | (iIdentityHashCode & 647782500);
                int i12 = (1071578367 & i11) | ((~i11) & (-1071578368));
                int i13 = i11 & (-1071578368);
                int i14 = (-1255970230) - (~(-(~(((i13 & i12) | (i12 ^ i13)) * 614))));
                int i15 = ~iIdentityHashCode;
                int i16 = ~((i15 & (-668886253)) | ((-668886253) ^ i15));
                int i17 = i16 ^ 647782500;
                int i18 = 647782500 & i16;
                int i19 = (i18 & i17) | (i17 ^ i18);
                int i21 = ~iIdentityHashCode;
                int i22 = ~i21;
                int i23 = (1050474615 & i21) | ((-1050474616) & i22);
                int i24 = i21 & (-1050474616);
                int i25 = (i23 & i24) | (i23 ^ i24);
                int i26 = -(-((i19 | ((i25 | (~i25)) & (~i25))) * (-1228)));
                int i27 = (i14 ^ i26) + ((i26 & i14) << 1);
                int i28 = ((-21103753) & i22) | (21103752 & i21);
                int i29 = (-21103753) & i21;
                int i31 = (i29 & i28) | (i28 ^ i29);
                int i32 = (i31 | (~i31)) & (~i31);
                int i33 = i21 ^ 668886252;
                int i34 = i21 & 668886252;
                int i35 = (i34 & i33) | (i33 ^ i34);
                int i36 = i35 & (-1050474616);
                int i37 = (i35 | (-1050474616)) & (~i36);
                int i38 = ~((i37 & i36) | (i37 ^ i36));
                int i39 = i32 & i38;
                int i41 = (((i38 | i32) & (~i39)) | i39) * 614;
                int i42 = (i27 ^ i41) + ((i41 & i27) << 1);
                int iIdentityHashCode2 = System.identityHashCode(anonymousClass5);
                int i43 = (-1848269553) & iIdentityHashCode2;
                int i44 = (~i43) & ((-1848269553) | iIdentityHashCode2);
                int i45 = (-272930986) + (((i43 & i44) | (i44 ^ i43)) * (-859));
                int i46 = ~iIdentityHashCode2;
                int i47 = (1848269552 & i46) | ((~i46) & (-1848269553));
                int i48 = (-1848269553) & i46;
                int i49 = ~((i48 & i47) | (i47 ^ i48));
                int i51 = (-289742852) ^ iIdentityHashCode2;
                int i52 = (-289742852) & iIdentityHashCode2;
                int i53 = ~((i52 & i51) | (i51 ^ i52));
                int i54 = (i45 - (~(-(~(((i49 & i53) | (((~i53) & i49) | ((~i49) & i53))) * 859))))) - 1;
                int i55 = (i54 ^ (-1)) + (i54 << 1);
                int i56 = ~iIdentityHashCode2;
                int i57 = (-2137354372) ^ i56;
                int i58 = i56 & (-2137354372);
                int i59 = ~((i58 & i57) | (i57 ^ i58));
                int i61 = ((-1847611521) & i59) | ((~i59) & 1847611520);
                int i62 = i59 & 1847611520;
                int i63 = ((i62 & i61) | (i61 ^ i62)) * 859;
                int i64 = i55 & i63;
                Object[] objArr2 = {parcel};
                if (i42 <= (((i55 ^ i63) | i64) << 1) - ((i63 | i55) & (~i64))) {
                    return (getSDKReferenceNumber) getSDKReferenceNumber(objArr2, -602669195, 602669195, (int) System.currentTimeMillis());
                }
                throw null;
            }

            private static /* synthetic */ Object getSDKAppID(Object[] objArr) {
                getSDKReferenceNumber getsdkreferencenumber = new getSDKReferenceNumber((Parcel) objArr[0]);
                int i11 = getSDKAppID;
                int i12 = i11 & 23;
                int i13 = ((i11 | 23) & (~i12)) + (i12 << 1);
                AuthenticationRequestParameters = i13 % 128;
                if (i13 % 2 != 0) {
                    return getsdkreferencenumber;
                }
                throw null;
            }

            public static /* synthetic */ Object getSDKReferenceNumber(Object[] objArr, int i11, int i12, int i13) {
                int i14 = ~i11;
                int i15 = ~(i14 | i12);
                int i16 = ~i13;
                int i17 = (i11 * 55) + (i12 * (-107)) + ((i15 | (~(i16 | i12))) * (-108));
                int i18 = ~(i14 | i13);
                int i19 = ~((~i12) | i11);
                int i21 = i17 + (((~(i11 | i16)) | i18 | i19) * 54) + ((i13 | i19) * 54);
                if (i21 == 1) {
                    return getDeviceData(objArr);
                }
                if (i21 != 2) {
                    return i21 != 3 ? getSDKAppID(objArr) : getSDKReferenceNumber(objArr);
                }
                return getSDKTransactionID(objArr);
            }

            private static /* synthetic */ Object getSDKTransactionID(Object[] objArr) {
                int iIntValue = ((Number) objArr[1]).intValue();
                int i11 = AuthenticationRequestParameters;
                int i12 = i11 & 61;
                getSDKAppID = ((((i11 | 61) & (~i12)) - (~(-(-(i12 << 1))))) - 1) % 128;
                getSDKReferenceNumber[] getsdkreferencenumberArr = (getSDKReferenceNumber[]) getSDKReferenceNumber(new Object[]{Integer.valueOf(iIntValue)}, 1986550165, -1986550162, iIntValue);
                int i13 = AuthenticationRequestParameters;
                int i14 = ((i13 ^ 69) - (~(-(-((i13 & 69) << 1))))) - 1;
                getSDKAppID = i14 % 128;
                if (i14 % 2 == 0) {
                    return getsdkreferencenumberArr;
                }
                throw null;
            }

            /* JADX WARN: Type inference failed for: r4v2, types: [atd.at.ChallengeResultCancelled$getSDKReferenceNumber, java.lang.Object] */
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ getSDKReferenceNumber createFromParcel(Parcel parcel) {
                return getSDKReferenceNumber(new Object[]{this, parcel}, 637281, -637280, System.identityHashCode(this));
            }

            /* JADX WARN: Type inference failed for: r4v2, types: [atd.at.ChallengeResultCancelled$getSDKReferenceNumber[], java.lang.Object[]] */
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ getSDKReferenceNumber[] newArray(int i11) {
                return (Object[]) getSDKReferenceNumber(new Object[]{this, Integer.valueOf(i11)}, 1038850112, -1038850110, i11);
            }

            private static getSDKReferenceNumber[] getSDKAppID(int i11) {
                return (getSDKReferenceNumber[]) getSDKReferenceNumber(new Object[]{Integer.valueOf(i11)}, 1986550165, -1986550162, i11);
            }

            private static /* synthetic */ Object getSDKReferenceNumber(Object[] objArr) {
                int iIntValue = ((Number) objArr[0]).intValue();
                int i11 = getSDKAppID;
                int i12 = ((i11 | 49) << 1) - (i11 ^ 49);
                AuthenticationRequestParameters = i12 % 128;
                getSDKReferenceNumber[] getsdkreferencenumberArr = new getSDKReferenceNumber[iIntValue];
                if (i12 % 2 == 0) {
                    throw null;
                }
                int i13 = ((i11 ^ 121) - (~(-(-((i11 & 121) << 1))))) - 1;
                AuthenticationRequestParameters = i13 % 128;
                if (i13 % 2 != 0) {
                    return getsdkreferencenumberArr;
                }
                throw null;
            }
        };
        private static int getDeviceData = 1;
        private static int getSDKAppID;
        private Set<ChallengeResultCompleted> AuthenticationRequestParameters;

        static {
            int i11 = getDeviceData;
            int i12 = (i11 ^ 59) + ((i11 & 59) << 1);
            getSDKAppID = i12 % 128;
            if (i12 % 2 != 0) {
                int i13 = 97 / 0;
            }
        }

        getSDKReferenceNumber(Parcelable parcelable) {
            super(parcelable);
            this.AuthenticationRequestParameters = new LinkedHashSet();
        }

        public static /* synthetic */ Object AuthenticationRequestParameters(Object[] objArr, int i11, int i12, int i13) {
            int i14 = ~i11;
            int i15 = (i11 * (-381)) + (i12 * 192) + (i14 * (-191)) + ((i11 | (~(i12 | i13))) * 191) + (((~(i14 | i12)) | (~(i12 | (~i13)))) * 191);
            if (i15 == 1) {
                return getSDKReferenceNumber(objArr);
            }
            if (i15 == 2) {
                getSDKReferenceNumber getsdkreferencenumber = (getSDKReferenceNumber) objArr[0];
                Set<ChallengeResultCompleted> set = (Set) objArr[1];
                int i16 = getSDKAppID;
                getDeviceData = ((-2) - ((i16 + 16) ^ (-1))) % 128;
                getsdkreferencenumber.AuthenticationRequestParameters = set;
                getDeviceData = (((((i16 ^ 87) | (i16 & 87)) << 1) - (~(-((i16 & (-88)) | ((~i16) & 87))))) - 1) % 128;
                return null;
            }
            if (i15 == 3) {
                return getDeviceData(objArr);
            }
            getSDKReferenceNumber getsdkreferencenumber2 = (getSDKReferenceNumber) objArr[0];
            int i17 = getSDKAppID;
            int i18 = i17 & 3;
            getDeviceData = ((((i17 ^ 3) | i18) << 1) - ((~i18) & (i17 | 3))) % 128;
            Set<ChallengeResultCompleted> set2 = getsdkreferencenumber2.AuthenticationRequestParameters;
            int i19 = (i17 & (-80)) | ((~i17) & 79);
            int i21 = (i17 & 79) << 1;
            getDeviceData = (((i19 | i21) << 1) - (i21 ^ i19)) % 128;
            return set2;
        }

        private static /* synthetic */ Object getDeviceData(Object[] objArr) {
            int i11 = getSDKAppID + 117;
            getDeviceData = i11 % 128;
            if (i11 % 2 != 0) {
                return 0;
            }
            throw null;
        }

        private static /* synthetic */ Object getSDKReferenceNumber(Object[] objArr) {
            getSDKReferenceNumber getsdkreferencenumber = (getSDKReferenceNumber) objArr[0];
            Parcel parcel = (Parcel) objArr[1];
            int iIntValue = ((Number) objArr[2]).intValue();
            int i11 = getDeviceData;
            int i12 = (i11 & (-32)) | ((~i11) & 31);
            int i13 = (i11 & 31) << 1;
            int i14 = (i12 & i13) + (i13 | i12);
            getSDKAppID = i14 % 128;
            if (i14 % 2 != 0) {
                super.writeToParcel(parcel, iIntValue);
                parcel.writeParcelableArray((ChallengeResultCompleted[]) getsdkreferencenumber.AuthenticationRequestParameters.toArray(new ChallengeResultCompleted[1]), iIntValue);
            } else {
                super.writeToParcel(parcel, iIntValue);
                parcel.writeParcelableArray((ChallengeResultCompleted[]) getsdkreferencenumber.AuthenticationRequestParameters.toArray(new ChallengeResultCompleted[0]), iIntValue);
            }
            int i15 = getSDKAppID;
            int i16 = (i15 & (-116)) | ((~i15) & 115);
            int i17 = (i15 & 115) << 1;
            int i18 = (i16 ^ i17) + ((i17 & i16) << 1);
            getDeviceData = i18 % 128;
            if (i18 % 2 != 0) {
                return null;
            }
            throw null;
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public final int describeContents() {
            return ((Integer) AuthenticationRequestParameters(new Object[]{this}, -765959038, 765959041, System.identityHashCode(this))).intValue();
        }

        final Set<ChallengeResultCompleted> getSDKAppID() {
            return (Set) AuthenticationRequestParameters(new Object[]{this}, -1229486165, 1229486165, System.identityHashCode(this));
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i11) {
            AuthenticationRequestParameters(new Object[]{this, parcel, Integer.valueOf(i11)}, 139429286, -139429285, i11);
        }

        getSDKReferenceNumber(Parcel parcel) {
            super(parcel);
            this.AuthenticationRequestParameters = new LinkedHashSet();
            Parcelable[] parcelableArray = parcel.readParcelableArray(ChallengeResultCompleted.class.getClassLoader());
            if (parcelableArray != null) {
                int length = parcelableArray.length;
                int i11 = 0;
                while (i11 < length) {
                    this.AuthenticationRequestParameters.add((ChallengeResultCompleted) parcelableArray[i11]);
                    int i12 = (i11 ^ (-47)) + ((i11 & (-47)) << 1);
                    i11 = ((i12 | 48) << 1) - (i12 ^ 48);
                }
            }
        }

        final void AuthenticationRequestParameters(Set<ChallengeResultCompleted> set) {
            AuthenticationRequestParameters(new Object[]{this, set}, -1781622911, 1781622913, System.identityHashCode(this));
        }
    }

    public ChallengeResultCancelled(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void getDeviceData(getTransactionStatus gettransactionstatus) {
        getSDKTransactionID(new Object[]{this, gettransactionstatus}, 702144957, -702144955, System.identityHashCode(this));
    }

    @Override // atd.at.getDeviceData
    protected final int getSDKAppID() {
        int i11 = getSDKEphemeralPublicKey;
        int i12 = R.layout.a3ds2_view_challenge_select;
        AuthenticationRequestParameters = (i11 + 51) % 128;
        return i12;
    }

    public ChallengeResultCancelled(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.getSDKTransactionID = new LinkedHashSet();
        setId(R.id.selectChallengeView);
        this.getSDKAppID = (ListView) findViewById(R.id.listView_selectInfoItems);
        this.getDeviceData = (Button) findViewById(R.id.button_next);
    }

    private static /* synthetic */ Object getSDKAppID(Object[] objArr) {
        ChallengeResultCancelled challengeResultCancelled = (ChallengeResultCancelled) objArr[0];
        ChallengeResultCompleted challengeResultCompleted = (ChallengeResultCompleted) objArr[1];
        getSDKEphemeralPublicKey = (AuthenticationRequestParameters + 125) % 128;
        challengeResultCancelled.getSDKTransactionID.remove(challengeResultCompleted);
        int i11 = getSDKEphemeralPublicKey + 97;
        AuthenticationRequestParameters = i11 % 128;
        if (i11 % 2 == 0) {
            return null;
        }
        throw null;
    }

    private void getSDKReferenceNumber(getSDKReferenceNumber getsdkreferencenumber) {
        ChallengeResult();
        Iterator it = ((Set) getSDKReferenceNumber.AuthenticationRequestParameters(new Object[]{getsdkreferencenumber}, -1229486165, 1229486165, System.identityHashCode(getsdkreferencenumber))).iterator();
        while (it.hasNext()) {
            AuthenticationRequestParameters = (getSDKEphemeralPublicKey + 115) % 128;
            getSDKReferenceNumber((ChallengeResultCompleted) it.next());
        }
        getSDKTransactionID(new Object[]{this}, 1510869211, -1510869211, System.identityHashCode(this));
        Iterator<ChallengeResultCompleted> it2 = this.getSDKTransactionID.iterator();
        while (it2.hasNext()) {
            AuthenticationRequestParameters = (getSDKEphemeralPublicKey + 21) % 128;
            getSDKAppID(it2.next());
            getSDKEphemeralPublicKey = (AuthenticationRequestParameters + 101) % 128;
        }
    }

    final void getSDKAppID(ChallengeResultCompleted challengeResultCompleted) {
        getSDKEphemeralPublicKey = (AuthenticationRequestParameters + 11) % 128;
        int i11 = 0;
        while (i11 < this.getSDKAppID.getChildCount()) {
            CompoundButton compoundButton = (CompoundButton) ((ViewGroup) this.getSDKAppID.getChildAt(i11)).findViewById(R.id.checkBox_selected);
            if (compoundButton.getTag().equals(challengeResultCompleted)) {
                compoundButton.setChecked(true);
            }
            i11++;
            getSDKEphemeralPublicKey = (AuthenticationRequestParameters + 97) % 128;
        }
    }

    final class getDeviceData extends AuthenticationRequestParameters {
        private static int getSDKReferenceNumber = 1;
        private static int getSDKTransactionID;

        getDeviceData(View view) {
            super(view);
        }

        public static /* synthetic */ Object getDeviceData(Object[] objArr, int i11, int i12, int i13) {
            int i14 = ~i11;
            int i15 = ~i12;
            int i16 = i14 | i15;
            int i17 = (i11 * (-496)) + (i12 * (-496)) + ((~i16) * DownloaderService.STATUS_TOO_MANY_REDIRECTS);
            int i18 = ~(i16 | i13);
            int i19 = ~i13;
            if (i17 + ((i18 | (~(i15 | i19 | i11))) * DownloaderService.STATUS_TOO_MANY_REDIRECTS) + (((~(i11 | i15 | i13)) | (~(i12 | i14)) | (~(i14 | i19))) * DownloaderService.STATUS_TOO_MANY_REDIRECTS) == 1) {
                return getDeviceData(objArr);
            }
            getDeviceData getdevicedata = (getDeviceData) objArr[0];
            int i21 = getSDKTransactionID;
            int i22 = i21 ^ 123;
            getSDKReferenceNumber = ((((i21 & 123) | i22) << 1) - i22) % 128;
            if (!getdevicedata.getDeviceData.isChecked()) {
                int i23 = getSDKReferenceNumber;
                int i24 = i23 & 103;
                int i25 = (i23 ^ 103) | i24;
                getSDKTransactionID = ((i24 & i25) + (i25 | i24)) % 128;
                getdevicedata.getDeviceData.setChecked(true);
                int i26 = getSDKTransactionID;
                getSDKReferenceNumber = ((((i26 | 38) << 1) - (i26 ^ 38)) - 1) % 128;
            }
            int i27 = getSDKReferenceNumber;
            int i28 = i27 & 69;
            int i29 = (i27 ^ 69) | i28;
            getSDKTransactionID = ((i28 & i29) + (i29 | i28)) % 128;
            return null;
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
            getDeviceData(new Object[]{this, compoundButton, Boolean.valueOf(z11)}, 1612994416, -1612994415, System.identityHashCode(this));
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            getDeviceData(new Object[]{this, view}, 1902578439, -1902578439, System.identityHashCode(this));
        }

        private static /* synthetic */ Object getDeviceData(Object[] objArr) {
            getDeviceData getdevicedata = (getDeviceData) objArr[0];
            CompoundButton compoundButton = (CompoundButton) objArr[1];
            boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
            int i11 = getSDKReferenceNumber;
            int i12 = (i11 | 15) << 1;
            int i13 = -(i11 ^ 15);
            int i14 = ((i12 | i13) << 1) - (i13 ^ i12);
            getSDKTransactionID = i14 % 128;
            if (i14 % 2 != 0) {
                throw null;
            }
            if (zBooleanValue) {
                ChallengeResultCompleted challengeResultCompleted = (ChallengeResultCompleted) compoundButton.getTag();
                ChallengeResultCancelled.this.ChallengeResult();
                ChallengeResultCancelled.this.getSDKReferenceNumber(challengeResultCompleted);
                ChallengeResultCancelled challengeResultCancelled = ChallengeResultCancelled.this;
                ChallengeResultCancelled.getSDKTransactionID(new Object[]{challengeResultCancelled}, 1510869211, -1510869211, System.identityHashCode(challengeResultCancelled));
                ChallengeResultCancelled.this.getSDKAppID(challengeResultCompleted);
                getSDKTransactionID = (getSDKReferenceNumber + 81) % 128;
            }
            int i15 = getSDKTransactionID;
            int i16 = i15 & 29;
            int i17 = (i15 | 29) & (~i16);
            int i18 = -(-(i16 << 1));
            getSDKReferenceNumber = (((i17 | i18) << 1) - (i17 ^ i18)) % 128;
            return null;
        }
    }

    final void AuthenticationRequestParameters(ChallengeResultCompleted challengeResultCompleted) {
        getSDKTransactionID(new Object[]{this, challengeResultCompleted}, -458375322, 458375323, System.identityHashCode(this));
    }

    private void getSDKAppID(getTransactionStatus gettransactionstatus) {
        List<ChallengeResultCompleted> listChallengeResultKt = gettransactionstatus.ChallengeResultKt();
        ChallengeResult();
        getSDKReferenceNumber(listChallengeResultKt.get(0));
        this.getSDKAppID.setAdapter((ListAdapter) new getSDKAppID(listChallengeResultKt) { // from class: atd.at.ChallengeResultCancelled.1
            private static int AuthenticationRequestParameters = 0;
            private static int getSDKReferenceNumber = 1;

            public static /* synthetic */ Object getDeviceData(Object[] objArr, int i11, int i12, int i13) {
                AnonymousClass1 anonymousClass1 = (AnonymousClass1) objArr[0];
                ViewGroup viewGroup = (ViewGroup) objArr[1];
                getDeviceData getdevicedata = ChallengeResultCancelled.this.new getDeviceData(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.a3ds2_view_single_select_item, viewGroup, false));
                int i14 = getSDKReferenceNumber;
                int i15 = i14 & 85;
                int i16 = (i14 | 85) & (~i15);
                int i17 = -(-(i15 << 1));
                AuthenticationRequestParameters = ((i16 & i17) + (i16 | i17)) % 128;
                return getdevicedata;
            }

            @Override // atd.at.ChallengeResultCancelled.getSDKAppID
            final AuthenticationRequestParameters dn_(ViewGroup viewGroup) {
                return (AuthenticationRequestParameters) getDeviceData(new Object[]{this, viewGroup}, -1528737425, 1528737425, System.identityHashCode(this));
            }
        });
        int i11 = AuthenticationRequestParameters + 57;
        getSDKEphemeralPublicKey = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 37 / 0;
        }
    }

    @Override // atd.at.getDeviceData
    protected final /* synthetic */ void getSDKTransactionID(atd.e.getAdditionalDetails getadditionaldetails) throws Throwable {
        AuthenticationRequestParameters = (getSDKEphemeralPublicKey + 125) % 128;
        getSDKTransactionID((getTransactionStatus) getadditionaldetails);
        int i11 = getSDKEphemeralPublicKey + 111;
        AuthenticationRequestParameters = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
    }

    private void getSDKTransactionID(getTransactionStatus gettransactionstatus) throws Throwable {
        getSDKEphemeralPublicKey = (AuthenticationRequestParameters + 45) % 128;
        int i11 = AnonymousClass4.AuthenticationRequestParameters[gettransactionstatus.getDeviceData().ordinal()];
        if (i11 == 1) {
            getSDKAppID(gettransactionstatus);
        } else if (i11 == 2) {
            getSDKTransactionID(new Object[]{this, gettransactionstatus}, 702144957, -702144955, System.identityHashCode(this));
            getSDKEphemeralPublicKey = (AuthenticationRequestParameters + 19) % 128;
        } else {
            StringBuilder sb2 = new StringBuilder();
            Object[] objArr = new Object[1];
            c("鰬逕鱹쉈ࡆ釵걋朂풏ઝ\ue51a꺰\u0dd7玶㷙ᦨ䘤볧盢䅯뽹\ue556쾤衅\uf7a0\u2e5f᠄", View.getDefaultSize(0, 0) + 1, objArr);
            sb2.append(((String) objArr[0]).intern());
            sb2.append(gettransactionstatus.getDeviceData());
            throw new RuntimeException(sb2.toString());
        }
        this.getDeviceData.setText((String) ChallengeResultError.getSDKTransactionID(new Object[]{gettransactionstatus}, 856692704, -856692704, System.identityHashCode(gettransactionstatus)));
        this.getDeviceData.setOnClickListener(this);
    }
}
