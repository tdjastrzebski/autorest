
namespace Petstore.Models
{
    using System;
    using System.Linq;
    using System.Collections.Generic;
    using Newtonsoft.Json;
    using Microsoft.Rest;
    using Microsoft.Rest.Serialization;
    using Microsoft.Rest.Azure;

    /// <summary>
    /// The access keys for the storage account.
    /// </summary>
    public partial class StorageAccountKeys
    {
        /// <summary>
        /// Initializes a new instance of the StorageAccountKeys class.
        /// </summary>
        public StorageAccountKeys() { }

        /// <summary>
        /// Initializes a new instance of the StorageAccountKeys class.
        /// </summary>
        /// <param name="key1">Gets the value of key 1.</param>
        /// <param name="key2">Gets the value of key 2.</param>
        public StorageAccountKeys(string key1 = default(string), string key2 = default(string))
        {
            Key1 = key1;
            Key2 = key2;
        }

        /// <summary>
        /// Gets or sets gets the value of key 1.
        /// </summary>
        [JsonProperty(PropertyName = "key1")]
        public string Key1 { get; set; }

        /// <summary>
        /// Gets or sets gets the value of key 2.
        /// </summary>
        [JsonProperty(PropertyName = "key2")]
        public string Key2 { get; set; }

    }
}
