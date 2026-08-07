package expo.modules.contacts.models;

import android.database.Cursor;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import expo.modules.contacts.Columns;
import java.util.Map;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import org.spongycastle.cms.CMSAttributeTableGenerator;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.q;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\t\u001a\u00020\b2\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u00058\u0016X\u0096D¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u00058\u0016X\u0096D¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016¨\u0006\u0019"}, d2 = {"Lexpo/modules/contacts/models/PhoneNumberModel;", "Lexpo/modules/contacts/models/BaseModel;", "<init>", "()V", "", "", "", "readableMap", "Ljn0/h0;", "fromMap", "(Ljava/util/Map;)V", AnnotatedPrivateKey.LABEL, "", "mapStringToType", "(Ljava/lang/String;)I", "Landroid/database/Cursor;", "cursor", "getLabelFromCursor", "(Landroid/database/Cursor;)Ljava/lang/String;", CMSAttributeTableGenerator.CONTENT_TYPE, "Ljava/lang/String;", "getContentType", "()Ljava/lang/String;", "dataAlias", "getDataAlias", "expo-contacts_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PhoneNumberModel extends BaseModel {
    private final String contentType = "vnd.android.cursor.item/phone_v2";
    private final String dataAlias = InquiryField.FloatField.TYPE2;

    @Override // expo.modules.contacts.models.BaseModel
    public void fromMap(Map<String, ? extends Object> readableMap) {
        s.k(readableMap, "readableMap");
        super.fromMap(readableMap);
        String data = getData();
        s.h(data);
        getMap().putString("digits", new q("[^\\d.]").j(data, ""));
    }

    @Override // expo.modules.contacts.CommonProvider
    public String getContentType() {
        return this.contentType;
    }

    @Override // expo.modules.contacts.models.BaseModel, expo.modules.contacts.CommonProvider
    public String getDataAlias() {
        return this.dataAlias;
    }

    @Override // expo.modules.contacts.models.BaseModel
    protected String getLabelFromCursor(Cursor cursor) {
        s.k(cursor, "cursor");
        String labelFromCursor = super.getLabelFromCursor(cursor);
        if (labelFromCursor != null) {
            return labelFromCursor;
        }
        switch (cursor.getInt(cursor.getColumnIndexOrThrow(Columns.TYPE))) {
            case 1:
                return "home";
            case 2:
                return "mobile";
            case 3:
                return "work";
            case 4:
                return "faxWork";
            case 5:
                return "faxHome";
            case 6:
                return "pager";
            case 7:
                return "other";
            case 8:
                return "callback";
            case 9:
                return "car";
            case 10:
                return "companyMain";
            case 11:
                return "isdn";
            case 12:
                return "main";
            case 13:
                return "otherFax";
            case 14:
                return "radio";
            case 15:
                return "telex";
            case 16:
                return "ttyTdd";
            case 17:
                return "workMobile";
            case 18:
                return "workPager";
            case 19:
                return "assistant";
            case 20:
                return "mms";
            default:
                return "unknown";
        }
    }

    @Override // expo.modules.contacts.models.BaseModel
    public int mapStringToType(String label) {
        if (label == null) {
            return 0;
        }
        switch (label.hashCode()) {
            case -1171162643:
                return !label.equals("otherFax") ? 0 : 13;
            case -1073799780:
                return !label.equals("faxHome") ? 0 : 5;
            case -1073745133:
                return !label.equals("workMobile") ? 0 : 17;
            case -1073352754:
                return !label.equals("faxWork") ? 0 : 4;
            case -1068855134:
                return !label.equals("mobile") ? 0 : 2;
            case -863168709:
                return !label.equals("ttyTdd") ? 0 : 16;
            case -508612650:
                return !label.equals("companyMain") ? 0 : 10;
            case -172220347:
                return !label.equals("callback") ? 0 : 8;
            case 98260:
                return !label.equals("car") ? 0 : 9;
            case 108243:
                return !label.equals("mms") ? 0 : 20;
            case 3208415:
                return !label.equals("home") ? 0 : 1;
            case 3241780:
                return !label.equals("isdn") ? 0 : 11;
            case 3343801:
                return !label.equals("main") ? 0 : 12;
            case 3655441:
                return !label.equals("work") ? 0 : 3;
            case 106069776:
                return !label.equals("other") ? 0 : 7;
            case 106426307:
                return !label.equals("pager") ? 0 : 6;
            case 108270587:
                return !label.equals("radio") ? 0 : 14;
            case 110244366:
                return !label.equals("telex") ? 0 : 15;
            case 1076099890:
                return !label.equals("workPager") ? 0 : 18;
            case 1429828318:
                return !label.equals("assistant") ? 0 : 19;
            default:
                return 0;
        }
    }
}
