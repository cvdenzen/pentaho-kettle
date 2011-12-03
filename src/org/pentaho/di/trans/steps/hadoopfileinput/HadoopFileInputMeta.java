/*
 * Copyright (c) 2011 Pentaho Corporation.  All rights reserved. 
 * This software was developed by Pentaho Corporation and is provided under the terms 
 * of the GNU Lesser General Public License, Version 2.1. You may not use 
 * this file except in compliance with the license. If you need a copy of the license, 
 * please go to http://www.gnu.org/licenses/lgpl-2.1.txt. The Original Code is Pentaho 
 * Data Integration.  The Initial Developer is Pentaho Corporation.
 *
 * Software distributed under the GNU Lesser Public License is distributed on an "AS IS" 
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or  implied. Please refer to 
 * the license for the specific language governing your rights and limitations.
 *
 * @author Michael D'Amour
 */

package org.pentaho.di.trans.steps.hadoopfileinput;

import org.pentaho.di.core.annotations.Step;
import org.pentaho.di.trans.steps.textfileinput.TextFileInputMeta;

@Step(id = "HadoopFileInputPlugin", image = "HDI.png", name = "Hadoop File Input", description="Process files from an HDFS location", categoryDescription="Hadoop")
public class HadoopFileInputMeta extends TextFileInputMeta {

}
