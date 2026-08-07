package atd.av;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ListView;

/* JADX INFO: loaded from: classes3.dex */
final class getSDKAppID extends ListView {
    private static int getDeviceData = 0;
    private static int getSDKReferenceNumber = 1;

    public getSDKAppID(Context context) {
        this(context, null);
    }

    public static /* synthetic */ Object AuthenticationRequestParameters(Object[] objArr, int i11, int i12, int i13) {
        return getDeviceData(objArr);
    }

    private static /* synthetic */ Object getDeviceData(Object[] objArr) {
        getSDKAppID getsdkappid = (getSDKAppID) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        ((Number) objArr[2]).intValue();
        int i11 = getDeviceData + 17;
        getSDKReferenceNumber = i11 % 128;
        if (i11 % 2 == 0) {
            super.onMeasure(iIntValue, View.MeasureSpec.makeMeasureSpec(536870911, Integer.MIN_VALUE));
            getsdkappid.getLayoutParams().height = getsdkappid.getMeasuredHeight();
            throw null;
        }
        super.onMeasure(iIntValue, View.MeasureSpec.makeMeasureSpec(536870911, Integer.MIN_VALUE));
        getsdkappid.getLayoutParams().height = getsdkappid.getMeasuredHeight();
        getDeviceData = (getSDKReferenceNumber + 21) % 128;
        return null;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View
    protected final void onMeasure(int i11, int i12) {
        AuthenticationRequestParameters(new Object[]{this, Integer.valueOf(i11), Integer.valueOf(i12)}, 457281528, -457281528, i11);
    }

    public getSDKAppID(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public getSDKAppID(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
    }
}
