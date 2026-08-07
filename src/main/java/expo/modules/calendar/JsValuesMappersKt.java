package expo.modules.calendar;

import android.util.Log;
import com.google.android.gms.common.Scopes;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import java.util.ArrayList;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000\u001a\u0012\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001H\u0000\u001a \u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u00010\u0007j\b\u0012\u0004\u0012\u00020\u0001`\b2\u0006\u0010\t\u001a\u00020\u0001H\u0000\u001a \u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u00010\u0007j\b\u0012\u0004\u0012\u00020\u0001`\b2\u0006\u0010\t\u001a\u00020\u0001H\u0000\u001a\u0010\u0010\u000b\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000\u001a\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0001H\u0000\u001a\u0010\u0010\r\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000\u001a\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0001H\u0000\u001a\u0010\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000\u001a\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0001H\u0000\u001a\u0010\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000\u001a\u0010\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0001H\u0000\u001a\u0010\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000\u001a\u0010\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0001H\u0000\u001a \u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u00010\u0007j\b\u0012\u0004\u0012\u00020\u0001`\b2\u0006\u0010\t\u001a\u00020\u0001H\u0000\u001a\u0010\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000\u001a\u0010\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0001H\u0000¨\u0006\u0018"}, d2 = {"reminderStringMatchingConstant", "", "constant", "", "reminderConstantMatchingString", InquiryField.StringField.TYPE, "calendarAllowedRemindersFromDBString", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "dbString", "calendarAllowedAvailabilitiesFromDBString", "availabilityStringMatchingConstant", "availabilityConstantMatchingString", "accessStringMatchingConstant", "accessConstantMatchingString", "calAccessStringMatchingConstant", "calAccessConstantMatchingString", "attendeeRelationshipStringMatchingConstant", "attendeeRelationshipConstantMatchingString", "attendeeTypeStringMatchingConstant", "attendeeTypeConstantMatchingString", "calendarAllowedAttendeeTypesFromDBString", "attendeeStatusStringMatchingConstant", "attendeeStatusConstantMatchingString", "expo-calendar_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class JsValuesMappersKt {
    public static final int accessConstantMatchingString(String string) {
        s.k(string, "string");
        int iHashCode = string.hashCode();
        if (iHashCode == -1952990840) {
            return string.equals("confidential") ? 1 : 0;
        }
        if (iHashCode != -977423767) {
            return (iHashCode == -314497661 && string.equals("private")) ? 2 : 0;
        }
        return !string.equals("public") ? 0 : 3;
    }

    public static final String accessStringMatchingConstant(int i11) {
        if (i11 == 0) {
            return "default";
        }
        if (i11 == 1) {
            return "confidential";
        }
        if (i11 != 2) {
            return i11 != 3 ? "default" : "public";
        }
        return "private";
    }

    public static final int attendeeRelationshipConstantMatchingString(String string) {
        s.k(string, "string");
        switch (string.hashCode()) {
            case -2141605073:
                return !string.equals("organizer") ? 0 : 2;
            case -2008522753:
                return !string.equals("speaker") ? 0 : 4;
            case 481140686:
                return !string.equals("performer") ? 0 : 3;
            case 542756026:
                return !string.equals("attendee") ? 0 : 1;
            default:
                return 0;
        }
    }

    public static final String attendeeRelationshipStringMatchingConstant(int i11) {
        if (i11 == 0) {
            return "none";
        }
        if (i11 == 1) {
            return "attendee";
        }
        if (i11 == 2) {
            return "organizer";
        }
        if (i11 != 3) {
            return i11 != 4 ? "none" : "speaker";
        }
        return "performer";
    }

    public static final int attendeeStatusConstantMatchingString(String string) {
        s.k(string, "string");
        switch (string.hashCode()) {
            case -2146525273:
                return !string.equals("accepted") ? 0 : 1;
            case -1320822226:
                return !string.equals("tentative") ? 0 : 4;
            case 568196142:
                return !string.equals("declined") ? 0 : 2;
            case 1960030843:
                return !string.equals("invited") ? 0 : 3;
            default:
                return 0;
        }
    }

    public static final String attendeeStatusStringMatchingConstant(int i11) {
        if (i11 == 0) {
            return "none";
        }
        if (i11 == 1) {
            return "accepted";
        }
        if (i11 == 2) {
            return "declined";
        }
        if (i11 != 3) {
            return i11 != 4 ? "none" : "tentative";
        }
        return "invited";
    }

    public static final int attendeeTypeConstantMatchingString(String string) {
        s.k(string, "string");
        int iHashCode = string.hashCode();
        if (iHashCode == -393139297) {
            return !string.equals("required") ? 0 : 1;
        }
        if (iHashCode != -341064690) {
            return (iHashCode == -79017120 && string.equals("optional")) ? 2 : 0;
        }
        return !string.equals("resource") ? 0 : 3;
    }

    public static final String attendeeTypeStringMatchingConstant(int i11) {
        if (i11 == 0) {
            return "none";
        }
        if (i11 == 1) {
            return "required";
        }
        if (i11 != 2) {
            return i11 != 3 ? "none" : "resource";
        }
        return "optional";
    }

    public static final int availabilityConstantMatchingString(String string) {
        s.k(string, "string");
        if (s.f(string, "free")) {
            return 1;
        }
        return s.f(string, "tentative") ? 2 : 0;
    }

    public static final String availabilityStringMatchingConstant(int i11) {
        if (i11 == 0) {
            return "busy";
        }
        if (i11 != 1) {
            return i11 != 2 ? "busy" : "tentative";
        }
        return "free";
    }

    public static final int calAccessConstantMatchingString(String string) {
        s.k(string, "string");
        switch (string.hashCode()) {
            case -1895276325:
                return !string.equals("contributor") ? 0 : 500;
            case -1537912219:
                return !string.equals("freebusy") ? 0 : 100;
            case -1307827859:
                return !string.equals("editor") ? 0 : 600;
            case 3496342:
                return !string.equals("read") ? 0 : 200;
            case 3506402:
                return !string.equals("root") ? 0 : 800;
            case 106164915:
                return !string.equals("owner") ? 0 : 700;
            case 529996748:
                return !string.equals("override") ? 0 : 400;
            case 1097400469:
                return !string.equals("respond") ? 0 : 300;
            default:
                return 0;
        }
    }

    public static final String calAccessStringMatchingConstant(int i11) {
        if (i11 == 0) {
            return "none";
        }
        if (i11 == 100) {
            return "freebusy";
        }
        if (i11 == 200) {
            return "read";
        }
        if (i11 == 300) {
            return "respond";
        }
        if (i11 == 400) {
            return "override";
        }
        if (i11 == 500) {
            return "contributor";
        }
        if (i11 == 600) {
            return "editor";
        }
        if (i11 != 700) {
            return i11 != 800 ? "none" : "root";
        }
        return "owner";
    }

    public static final ArrayList<String> calendarAllowedAttendeeTypesFromDBString(String dbString) {
        s.k(dbString, "dbString");
        ArrayList<String> arrayList = new ArrayList<>();
        for (String str : (String[]) t.f1(dbString, new String[]{","}, false, 0, 6, null).toArray(new String[0])) {
            try {
                arrayList.add(attendeeTypeStringMatchingConstant(Integer.parseInt(str)));
            } catch (NumberFormatException e11) {
                Log.e(CalendarModule.INSTANCE.getTAG$expo_calendar_release(), "Couldn't convert attendee constant into an int.", e11);
            }
        }
        return arrayList;
    }

    public static final ArrayList<String> calendarAllowedAvailabilitiesFromDBString(String dbString) {
        s.k(dbString, "dbString");
        ArrayList<String> arrayList = new ArrayList<>();
        for (String str : (String[]) t.f1(dbString, new String[]{","}, false, 0, 6, null).toArray(new String[0])) {
            int i11 = Integer.parseInt(str);
            if (i11 == 0) {
                arrayList.add("busy");
            } else if (i11 == 1) {
                arrayList.add("free");
            } else if (i11 == 2) {
                arrayList.add("tentative");
            }
        }
        return arrayList;
    }

    public static final ArrayList<String> calendarAllowedRemindersFromDBString(String dbString) {
        s.k(dbString, "dbString");
        ArrayList<String> arrayList = new ArrayList<>();
        for (String str : (String[]) t.f1(dbString, new String[]{","}, false, 0, 6, null).toArray(new String[0])) {
            try {
                arrayList.add(reminderStringMatchingConstant(Integer.parseInt(str)));
            } catch (NumberFormatException e11) {
                Log.e(CalendarModule.INSTANCE.getTAG$expo_calendar_release(), "Couldn't convert reminder constant into an int.", e11);
            }
        }
        return arrayList;
    }

    public static final int reminderConstantMatchingString(String str) {
        if (str == null) {
            return 0;
        }
        switch (str.hashCode()) {
            case 114009:
                return !str.equals("sms") ? 0 : 3;
            case 92895825:
                return !str.equals("alarm") ? 0 : 4;
            case 92899676:
                return !str.equals("alert") ? 0 : 1;
            case 96619420:
                return !str.equals(Scopes.EMAIL) ? 0 : 2;
            default:
                return 0;
        }
    }

    public static final String reminderStringMatchingConstant(int i11) {
        if (i11 == 0) {
            return "default";
        }
        if (i11 == 1) {
            return "alert";
        }
        if (i11 == 2) {
            return Scopes.EMAIL;
        }
        if (i11 != 3) {
            return i11 != 4 ? "default" : "alarm";
        }
        return "sms";
    }
}
