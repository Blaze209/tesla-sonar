package atd.av;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.adyen.threeds2.R;

/* JADX INFO: loaded from: classes3.dex */
public final class getSDKReferenceNumber extends LinearLayout implements View.OnClickListener {
    private static int AuthenticationRequestParameters = 1;
    private static int getSDKReferenceNumber;
    private getSDKTransactionID getDeviceData;
    private final TextView getSDKAppID;
    private final Button getSDKTransactionID;

    public interface getSDKTransactionID {
        void AuthenticationRequestParameters();
    }

    public getSDKReferenceNumber(Context context) {
        this(context, null);
    }

    public static /* synthetic */ Object AuthenticationRequestParameters(Object[] objArr, int i11, int i12, int i13) {
        return AuthenticationRequestParameters(objArr);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        AuthenticationRequestParameters(new Object[]{this, view}, -1489317320, 1489317320, System.identityHashCode(this));
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i11) {
        int i12 = getSDKReferenceNumber;
        int i13 = i12 & 57;
        AuthenticationRequestParameters = ((((i12 ^ 57) | i13) << 1) - ((i12 | 57) & (~i13))) % 128;
        getChildAt(0).setBackgroundColor(i11);
        int i14 = AuthenticationRequestParameters;
        getSDKReferenceNumber = ((i14 & 101) + (i14 | 101)) % 128;
    }

    public final void setCancelButtonBackgroundColor(int i11) {
        int i12 = getSDKReferenceNumber;
        int i13 = ((i12 ^ 82) + ((i12 & 82) << 1)) - 1;
        AuthenticationRequestParameters = i13 % 128;
        if (i13 % 2 == 0) {
            this.getSDKTransactionID.setBackgroundColor(i11);
            int i14 = 0 / 0;
        } else {
            this.getSDKTransactionID.setBackgroundColor(i11);
        }
        int i15 = getSDKReferenceNumber;
        int i16 = i15 & 29;
        int i17 = (i15 | 29) & (~i16);
        int i18 = -(-(i16 << 1));
        int i19 = (i17 ^ i18) + ((i17 & i18) << 1);
        AuthenticationRequestParameters = i19 % 128;
        if (i19 % 2 == 0) {
            throw null;
        }
    }

    public final void setCancelButtonText(String str) {
        int i11 = AuthenticationRequestParameters;
        int i12 = i11 & 75;
        getSDKReferenceNumber = ((((i11 ^ 75) | i12) << 1) - ((i11 | 75) & (~i12))) % 128;
        this.getSDKTransactionID.setText(str);
        int i13 = getSDKReferenceNumber;
        int i14 = (i13 & (-120)) | ((~i13) & 119);
        int i15 = (i13 & 119) << 1;
        int i16 = (i14 ^ i15) + ((i15 & i14) << 1);
        AuthenticationRequestParameters = i16 % 128;
        if (i16 % 2 == 0) {
            int i17 = 41 / 0;
        }
    }

    public final void setCancelButtonTextColor(int i11) {
        this.getSDKTransactionID.setTextColor(i11);
        int i12 = AuthenticationRequestParameters;
        int i13 = i12 & 49;
        int i14 = -(-((i12 ^ 49) | i13));
        int i15 = ((i13 | i14) << 1) - (i14 ^ i13);
        getSDKReferenceNumber = i15 % 128;
        if (i15 % 2 != 0) {
            throw null;
        }
    }

    public final void setCancelButtonTextTypeface(Typeface typeface) {
        int i11 = getSDKReferenceNumber;
        int i12 = i11 & 65;
        int i13 = i11 | 65;
        AuthenticationRequestParameters = ((i12 ^ i13) + ((i13 & i12) << 1)) % 128;
        this.getSDKTransactionID.setTypeface(typeface);
        int i14 = getSDKReferenceNumber;
        int i15 = (((i14 & (-76)) | ((~i14) & 75)) - (~((i14 & 75) << 1))) - 1;
        AuthenticationRequestParameters = i15 % 128;
        if (i15 % 2 == 0) {
            int i16 = 54 / 0;
        }
    }

    public final void setTitle(String str) {
        int i11 = AuthenticationRequestParameters + 73;
        getSDKReferenceNumber = i11 % 128;
        if (i11 % 2 != 0) {
            this.getSDKAppID.setText(str);
            int i12 = 89 / 0;
        } else {
            this.getSDKAppID.setText(str);
        }
        System.identityHashCode(this);
        System.identityHashCode(this);
    }

    public final void setTitleFontSize(Integer num) {
        int i11 = AuthenticationRequestParameters;
        int i12 = (i11 & 27) + (i11 | 27);
        getSDKReferenceNumber = i12 % 128;
        if (i12 % 2 != 0) {
            this.getSDKAppID.setTextSize(num.intValue());
            throw null;
        }
        this.getSDKAppID.setTextSize(num.intValue());
        int i13 = AuthenticationRequestParameters + 19;
        getSDKReferenceNumber = i13 % 128;
        if (i13 % 2 != 0) {
            throw null;
        }
    }

    public final void setTitleTextColor(int i11) {
        AuthenticationRequestParameters = (getSDKReferenceNumber + 121) % 128;
        this.getSDKAppID.setTextColor(i11);
        int i12 = AuthenticationRequestParameters + 115;
        getSDKReferenceNumber = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
    }

    public final void setTitleTypeface(Typeface typeface) {
        int i11 = AuthenticationRequestParameters;
        getSDKReferenceNumber = ((i11 & 93) + (i11 | 93)) % 128;
        this.getSDKAppID.setTypeface(typeface);
        int i12 = AuthenticationRequestParameters;
        int i13 = i12 & 11;
        int i14 = i13 + ((i12 ^ 11) | i13);
        getSDKReferenceNumber = i14 % 128;
        if (i14 % 2 != 0) {
            int i15 = 56 / 0;
        }
    }

    public final void setToolbarListener(getSDKTransactionID getsdktransactionid) {
        int i11 = AuthenticationRequestParameters;
        int i12 = ((i11 ^ 123) + ((i11 & 123) << 1)) % 128;
        getSDKReferenceNumber = i12;
        this.getDeviceData = getsdktransactionid;
        int i13 = (((i12 | 62) << 1) - (i12 ^ 62)) - 1;
        AuthenticationRequestParameters = i13 % 128;
        if (i13 % 2 == 0) {
            throw null;
        }
    }

    public getSDKReferenceNumber(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0036  */
    /* JADX WARN: Code duplicated, block: B:14:0x0042  */
    /* JADX WARN: Code duplicated, block: B:16:0x004a  */
    /* JADX WARN: Code duplicated, block: B:9:0x0026  */
    private static /* synthetic */ Object AuthenticationRequestParameters(Object[] objArr) {
        int i11;
        getSDKReferenceNumber getsdkreferencenumber = (getSDKReferenceNumber) objArr[0];
        View view = (View) objArr[1];
        int i12 = AuthenticationRequestParameters;
        int i13 = ((i12 & 32) + (i12 | 32)) - 1;
        int i14 = i13 % 128;
        getSDKReferenceNumber = i14;
        if (i13 % 2 != 0) {
            int i15 = 23 / 0;
            if (getsdkreferencenumber.getDeviceData != null) {
                int i16 = i14 & 121;
                i11 = (i16 - (~((i14 ^ 121) | i16))) - 1;
                AuthenticationRequestParameters = i11 % 128;
                if (i11 % 2 == 0) {
                    int i17 = 14 / 0;
                    if (view.equals(getsdkreferencenumber.getSDKTransactionID)) {
                        getsdkreferencenumber.getDeviceData.AuthenticationRequestParameters();
                        int i18 = AuthenticationRequestParameters;
                        getSDKReferenceNumber = (((i18 | 3) << 1) - (i18 ^ 3)) % 128;
                    }
                } else if (view.equals(getsdkreferencenumber.getSDKTransactionID)) {
                    getsdkreferencenumber.getDeviceData.AuthenticationRequestParameters();
                    int i19 = AuthenticationRequestParameters;
                    getSDKReferenceNumber = (((i19 | 3) << 1) - (i19 ^ 3)) % 128;
                }
            }
        } else if (getsdkreferencenumber.getDeviceData != null) {
            int i110 = i14 & 121;
            i11 = (i110 - (~((i14 ^ 121) | i110))) - 1;
            AuthenticationRequestParameters = i11 % 128;
            if (i11 % 2 == 0) {
                int i111 = 14 / 0;
                if (view.equals(getsdkreferencenumber.getSDKTransactionID)) {
                    getsdkreferencenumber.getDeviceData.AuthenticationRequestParameters();
                    int i112 = AuthenticationRequestParameters;
                    getSDKReferenceNumber = (((i112 | 3) << 1) - (i112 ^ 3)) % 128;
                }
            } else if (view.equals(getsdkreferencenumber.getSDKTransactionID)) {
                getsdkreferencenumber.getDeviceData.AuthenticationRequestParameters();
                int i113 = AuthenticationRequestParameters;
                getSDKReferenceNumber = (((i113 | 3) << 1) - (i113 ^ 3)) % 128;
            }
        }
        int i21 = AuthenticationRequestParameters;
        int i22 = i21 & 51;
        int i23 = i22 + ((i21 ^ 51) | i22);
        getSDKReferenceNumber = i23 % 128;
        if (i23 % 2 == 0) {
            return null;
        }
        throw null;
    }

    public getSDKReferenceNumber(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        View.inflate(context, R.layout.a3ds2_widget_toolbar, this);
        CharSequence charSequenceLoadLabel = getContext().getApplicationInfo().loadLabel(getContext().getPackageManager());
        TextView textView = (TextView) findViewById(R.id.textView_title);
        this.getSDKAppID = textView;
        textView.setText(charSequenceLoadLabel);
        Button button = (Button) findViewById(R.id.button_cancel);
        this.getSDKTransactionID = button;
        button.setOnClickListener(this);
    }
}
