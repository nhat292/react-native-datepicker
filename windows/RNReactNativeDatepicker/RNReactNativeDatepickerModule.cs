using ReactNative.Bridge;
using System;
using System.Collections.Generic;
using Windows.ApplicationModel.Core;
using Windows.UI.Core;

namespace React.Native.Datepicker.RNReactNativeDatepicker
{
    /// <summary>
    /// A module that allows JS to share data.
    /// </summary>
    class RNReactNativeDatepickerModule : NativeModuleBase
    {
        /// <summary>
        /// Instantiates the <see cref="RNReactNativeDatepickerModule"/>.
        /// </summary>
        internal RNReactNativeDatepickerModule()
        {

        }

        /// <summary>
        /// The name of the native module.
        /// </summary>
        public override string Name
        {
            get
            {
                return "RNReactNativeDatepicker";
            }
        }
    }
}
