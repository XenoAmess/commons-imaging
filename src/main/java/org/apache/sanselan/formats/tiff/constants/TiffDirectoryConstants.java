/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.sanselan.formats.tiff.constants;

public interface TiffDirectoryConstants
{

	public static final int DIRECTORY_TYPE_UNKNOWN = -1;
	public static final int DIRECTORY_TYPE_ROOT = 0;
	public static final int DIRECTORY_TYPE_SUB = 1;
	public static final int DIRECTORY_TYPE_SUB1 = 2;
	public static final int DIRECTORY_TYPE_SUB2 = 3;
	public static final int DIRECTORY_TYPE_THUMBNAIL = 2;
	public static final int DIRECTORY_TYPE_EXIF = -2;
	//	public static final int DIRECTORY_TYPE_SUB = 5;
	public static final int DIRECTORY_TYPE_GPS = -3;
	public static final int DIRECTORY_TYPE_INTEROPERABILITY = -4;
	public static final int DIRECTORY_TYPE_MAKER_NOTES = -5;
	public static final int DIRECTORY_TYPE_DIR_0 = 0;
	public static final int DIRECTORY_TYPE_DIR_1 = 1;
	public static final int DIRECTORY_TYPE_DIR_2 = 2;
	public static final int DIRECTORY_TYPE_DIR_3 = 3;
	public static final int DIRECTORY_TYPE_DIR_4 = 4;

	public static class ExifDirectoryType
	{
		public final int directoryType;
		public final String name;

		public ExifDirectoryType(final int directoryType, final String name)
		{
			this.directoryType = directoryType;
			this.name = name;
		}
	}

	public static final ExifDirectoryType TIFF_DIRECTORY_ROOT = new ExifDirectoryType(
			DIRECTORY_TYPE_ROOT, "Root");
	public static final ExifDirectoryType EXIF_DIRECTORY_EXIF_IFD = new ExifDirectoryType(
			DIRECTORY_TYPE_EXIF, "Exif IFD");
	public static final ExifDirectoryType TIFF_DIRECTORY_IFD0 = new ExifDirectoryType(
			DIRECTORY_TYPE_DIR_0, "IFD0");
	public static final ExifDirectoryType EXIF_DIRECTORY_IFD0 = new ExifDirectoryType(
			DIRECTORY_TYPE_DIR_0, "IFD0");
	public static final ExifDirectoryType TIFF_DIRECTORY_IFD1 = new ExifDirectoryType(
			DIRECTORY_TYPE_DIR_1, "IFD1");
	public static final ExifDirectoryType EXIF_DIRECTORY_IFD1 = new ExifDirectoryType(
			DIRECTORY_TYPE_DIR_1, "IFD1");
	public static final ExifDirectoryType TIFF_DIRECTORY_IFD2 = new ExifDirectoryType(
			DIRECTORY_TYPE_DIR_2, "IFD2");
	public static final ExifDirectoryType EXIF_DIRECTORY_IFD2 = new ExifDirectoryType(
			DIRECTORY_TYPE_DIR_2, "IFD2");
	public static final ExifDirectoryType EXIF_DIRECTORY_INTEROP_IFD = new ExifDirectoryType(
			DIRECTORY_TYPE_INTEROPERABILITY, "Interop IFD");
	public static final ExifDirectoryType EXIF_DIRECTORY_MAKER_NOTES = new ExifDirectoryType(
			DIRECTORY_TYPE_MAKER_NOTES, "Maker Notes");
	public static final ExifDirectoryType EXIF_DIRECTORY_SUB_IFD = new ExifDirectoryType(
			DIRECTORY_TYPE_SUB, "Sub IFD");
	public static final ExifDirectoryType EXIF_DIRECTORY_SUB_IFD1 = new ExifDirectoryType(
			DIRECTORY_TYPE_SUB1, "Sub IFD1");
	public static final ExifDirectoryType EXIF_DIRECTORY_SUB_IFD2 = new ExifDirectoryType(
			DIRECTORY_TYPE_SUB2, "Sub IFD2");
	public static final ExifDirectoryType EXIF_DIRECTORY_UNKNOWN = null;
	public static final ExifDirectoryType EXIF_DIRECTORY_GPS = new ExifDirectoryType(
			DIRECTORY_TYPE_GPS, "GPS IFD");

	public static final ExifDirectoryType EXIF_DIRECTORIES[] = {
			TIFF_DIRECTORY_ROOT, EXIF_DIRECTORY_EXIF_IFD, TIFF_DIRECTORY_IFD0,
			EXIF_DIRECTORY_IFD0, TIFF_DIRECTORY_IFD1, EXIF_DIRECTORY_IFD1,
			TIFF_DIRECTORY_IFD2, EXIF_DIRECTORY_IFD2,
			EXIF_DIRECTORY_INTEROP_IFD, EXIF_DIRECTORY_MAKER_NOTES,
			EXIF_DIRECTORY_SUB_IFD, EXIF_DIRECTORY_SUB_IFD1,
			EXIF_DIRECTORY_SUB_IFD2,
//EXIF_DIRECTORY_UNKNOWN,
			EXIF_DIRECTORY_GPS,
	};
	
}