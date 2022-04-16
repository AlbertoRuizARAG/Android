import java.util.*

object UuidUtils {

    private const val START_INDEX_UUID = 4
    private const val END_INDEX_UUID = 8

    const val BLUETOOTH_BASE_UUID_PREFIX = "0000"
    const val BLUETOOTH_BASE_UUID_POSTFIX = "-0000-1000-8000-00805F9B34FB"

    fun parseIntFromUuidStart(uuid: String): Int {
        return uuid.split("-".toRegex()).toTypedArray()[0].toLong(16).toInt()
    }

    fun getUuidText(uuid: UUID): String {
        val strUuid = uuid.toString().uppercase(Locale.getDefault())
        return if (isSig(strUuid)) {
            "0x" + convert128to16UUID(strUuid)
        } else {
            strUuid
        }
    }

    // Converts UUID from 16-bit to 128-bit form
    fun convert16to128UUID(uuid: String): String {
        return BLUETOOTH_BASE_UUID_PREFIX + uuid + BLUETOOTH_BASE_UUID_POSTFIX
    }

    // Converts UUID from 128-bit to 16-bit form
    fun convert128to16UUID(uuid: String): String {
        return uuid.substring(START_INDEX_UUID, END_INDEX_UUID)
    }

    private fun isSig(strUuid: String) : Boolean {
        return strUuid.startsWith(BLUETOOTH_BASE_UUID_PREFIX)
                && strUuid.endsWith(BLUETOOTH_BASE_UUID_POSTFIX)
    }
}
