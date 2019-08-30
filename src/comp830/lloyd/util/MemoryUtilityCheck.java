/**
 * 
 */
package comp830.lloyd.util;

/**
 * @author lloydbriantech 2019
 * UNH MS 2019
 */
public class MemoryUtilityCheck {

	private static final long MEGABYTE = 1024L * 1024L;
	private Runtime rt = Runtime.getRuntime();
		
	private long megaBytesofBytes(long bytes) {
		return bytes / MEGABYTE;
	}
	
	public long getTotalMemory() {
		return megaBytesofBytes(rt.totalMemory());
	}
	
	public long getFreeMemory() {
		return megaBytesofBytes(rt.freeMemory());
	}
}
